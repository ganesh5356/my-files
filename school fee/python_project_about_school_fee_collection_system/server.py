from http.server import SimpleHTTPRequestHandler, HTTPServer
from urllib.parse import parse_qs, urlparse
import json
import os
from pathlib import Path

students = [] 

class Student:
    def __init__(self, name, roll, class_name, total_fee):
        self.name = name.strip()
        self.roll = str(roll).strip()
        self.class_name = class_name.strip()
        self.total_fee = int(total_fee)
        self.paid = 0

    def pay(self, amount):
        amount = int(amount)
        if amount <= 0:
            raise ValueError("Amount must be positive")
        if self.paid + amount > self.total_fee:
            raise ValueError("Payment exceeds total fee")
        self.paid += amount
    
    def to_dict(self):
        return {
            "name": self.name,
            "roll": self.roll,
            "class": self.class_name,
            "total_fee": self.total_fee,
            "paid": self.paid,
            "balance": self.total_fee - self.paid
        }

class MyHandler(SimpleHTTPRequestHandler):
    # Allow CORS (optional)
    def end_headers(self):
        self.send_header("Access-Control-Allow-Origin", "*")
        self.send_header("Access-Control-Allow-Headers", "Content-Type")
        self.send_header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
        super().end_headers()

    def do_OPTIONS(self):
        self.send_response(200)
        self.end_headers()

    def do_POST(self):
        length = int(self.headers.get("Content-Length", 0))
        body = self.rfile.read(length).decode()
        data = parse_qs(body)

        if self.path == "/register":
            name = data.get("name", [""])[0]
            roll = data.get("roll", [""])[0].strip()
            class_name = data.get("class", [""])[0]
            total_fee = data.get("total_fee", ["0"])[0]

            if not name or not roll or not class_name:
                self._send_json({"error": "All fields are required"}, status=400)
                return
            try:
                total_fee = int(total_fee)
                if total_fee <= 0:
                    raise ValueError
            except ValueError:
                self._send_json({"error": "total_fee must be a positive integer"}, status=400)
                return

            for s in students:
                if s.roll == roll:
                    self._send_json({"error": "Student already registered with same roll no"}, status=400)
                    return 

            student = Student(name, roll, class_name, total_fee)
            students.append(student)
            self._send_json({"message": "Student Registered", "student": student.to_dict()})

        elif self.path == "/pay":
            roll = data.get("roll", [""])[0].strip()
            amount = data.get("amount", ["0"])[0]

            if not roll:
                self._send_json({"error": "roll is required"}, status=400)
                return

            for s in students:
                if s.roll == roll:
                    try:
                        s.pay(amount)
                        self._send_json({"message": "Payment Done", "student": s.to_dict()})
                    except ValueError as e:
                        self._send_json({"error": str(e)}, status=400)
                    return

            self._send_json({"error": "Student not found"}, status=404)

        else:
            self._send_json({"error": "Unknown endpoint"}, status=404)

    def do_GET(self):
        parsed = urlparse(self.path)
        query = parse_qs(parsed.query)

        if parsed.path == "/search":
            name = query.get("name", [""])[0].lower().strip()
            results = [s.to_dict() for s in students if name in s.name.lower()]
            self._send_json(results)

        elif parsed.path == "/all":
            self._send_json([s.to_dict() for s in students])

        else:
            return super().do_GET()

    def _send_json(self, data, status=200):
        self.send_response(status)
        self.send_header("Content-Type", "application/json")
        self.end_headers()
        self.wfile.write(json.dumps(data).encode())

if __name__ == "__main__":
    # 👇 Force the HTTP root to be the folder where this file lives
    BASE_DIR = Path(__file__).parent.resolve()
    os.chdir(BASE_DIR)
    print("Serving files from:", BASE_DIR)

    PORT = 8000
    print(f" Server running at http://localhost:{PORT}")
    HTTPServer(("localhost", PORT), MyHandler).serve_forever()
