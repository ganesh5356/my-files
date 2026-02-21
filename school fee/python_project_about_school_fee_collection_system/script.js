function showMessage(msg, isError = false) {
  const box = document.getElementById("messageBox");
  if (!box) return alert(msg);
  box.textContent = msg;
  box.style.margin = "16px auto";
  box.style.maxWidth = "900px";
  box.style.padding = "10px 14px";
  box.style.borderRadius = "10px";
  box.style.background = isError ? "#fdecea" : "#ecfdf3";
  box.style.color = isError ? "#b42318" : "#027a48";
  box.style.border = isError ? "1px solid #f2b8b5" : "1px solid #a6f0c6";
}

function renderTable(data) {
  if (!data || data.length === 0) {
    return "<p>No records found.</p>";
  }

  let table = `
    <table border="1" cellpadding="5" cellspacing="0">
      <tr>
        <th>Name</th>
        <th>Roll no</th>
        <th>Class</th>
        <th>Total Fee (₹)</th>
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
  const name = document.getElementById("regName").value.trim();
  const roll = document.getElementById("regRoll").value.trim();
  const className = document.getElementById("regClass").value.trim();
  const totalFee = document.getElementById("regFee").value.trim();

  if (!name || !roll || !className || !totalFee) {
    showMessage("Please fill all fields.", true);
    return;
  }

  const response = await fetch("/register", {
    method: "POST",
    headers: { "Content-Type": "application/x-www-form-urlencoded" },
    body: `name=${encodeURIComponent(name)}&roll=${encodeURIComponent(roll)}&class=${encodeURIComponent(className)}&total_fee=${encodeURIComponent(totalFee)}`
  });

  const result = await response.json();
  showMessage(result.message || result.error, !!result.error);
  getAllStudents(); 
}

async function payFee() {
  const roll = document.getElementById("payRoll").value.trim();
  const amount = document.getElementById("payAmount").value.trim();

  if (!roll || !amount) {
    showMessage("Please enter roll and amount.", true);
    return;
  }

  const response = await fetch("/pay", {
    method: "POST",
    headers: { "Content-Type": "application/x-www-form-urlencoded" },
    body: `roll=${encodeURIComponent(roll)}&amount=${encodeURIComponent(amount)}`
  });

  const result = await response.json();
  showMessage(result.message || result.error, !!result.error);
  getAllStudents();
}

async function searchStudent() {
  const name = document.getElementById("searchName").value.trim();
  if (!name) {
    showMessage("Enter a name to search.", true);
    return;
  }

  const response = await fetch(`/search?name=${encodeURIComponent(name)}`);
  const data = await response.json();

  document.getElementById("studentsTable").innerHTML = renderTable(data);
}

async function getAllStudents() {
  const response = await fetch("/all");
  const data = await response.json();
  document.getElementById("studentsTable").innerHTML = renderTable(data);
}

// Load all records on page load
window.onload = getAllStudents;
