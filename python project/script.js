function renderTable(data) {
  if (!data || data.length === 0) {
    return "<p>No records found.</p>";
  }

  let table = `
    <table>
      <tr>
        <th>Name</th>
        <th>Roll no</th>
        <th>Class</th>
        <th>Total Fee(₹)</th>
        <th>Paid (₹)</th>
        <th>Balance (₹)</th>
      </tr>
  `;

  data.forEach(student => {
    table += `
      <tr>
        <td>${student.name}</td>
        <td>${student.roll}</td>
        <td>${student.class}</td>
        <td>${student.total_fee}</td>
        <td>${student.paid}</td>
        <td>${student.balance}</td>
      </tr>
    `;
  });

  table += `</table>`;
  return table;
}

async function registerStudent() {
  const name = document.getElementById("regName").value;
  const roll = document.getElementById("regRoll").value;
  const className = document.getElementById("regClass").value;
  const totalFee = document.getElementById("regFee").value;

  const response = await fetch("/register", {
    method: "POST",
    headers: { "Content-Type": "application/x-www-form-urlencoded" },
    body: `name=${encodeURIComponent(name)}&roll=${encodeURIComponent(roll)}&class=${encodeURIComponent(className)}&total_fee=${encodeURIComponent(totalFee)}`
  });

  const result = await response.json();
if (response.ok && result.student) {
  alert(`Student successfully registered with ${result.student.name} (Roll: ${result.student.roll})`);
} else {
  alert(result.error || result.message || "Registration failed");
}
getAllStudents();

}

async function payFee() {
  const roll = document.getElementById("payRoll").value;
  const amount = document.getElementById("payAmount").value;

  const response = await fetch("/pay", {
    method: "POST",
    headers: { "Content-Type": "application/x-www-form-urlencoded" },
    body: `roll=${encodeURIComponent(roll)}&amount=${encodeURIComponent(amount)}`
  });

  const result = await response.json();
  alert(result.message || result.error);
  getAllStudents();
}

async function searchStudent() {
  const name = document.getElementById("searchName").value;

  const response = await fetch(`/search?name=${encodeURIComponent(name)}`);
  const data = await response.json();

  document.getElementById("studentsTable").innerHTML = renderTable(data);
}

async function getAllStudents() {
  const response = await fetch("/all");
  const data = await response.json();

  document.getElementById("studentsTable").innerHTML = renderTable(data);
}
window.onload = getAllStudents;
