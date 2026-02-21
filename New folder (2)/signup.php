<?php
session_start();
$con = mysqli_connect('localhost', 'root', '', 'logindbs');
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

if (isset($_POST['signup'])) {
    $Name = trim($_POST['name']);
    $Age = trim($_POST['age']);
    $Mobile_no = trim($_POST['mobile']);
    $RawPassword = $_POST['password'];

    if (!preg_match('/^[0-9]{10}$/', $Mobile_no)) {
        $signup_error = "Invalid mobile number. Must be 10 digits.";
    } elseif (!is_numeric($Age) || $Age < 1 || $Age > 120) {
        $signup_error = "Invalid age.";
    } else {
        $stmt = $con->prepare("SELECT * FROM Signin WHERE Mobile_no = ?");
        $stmt->bind_param("s", $Mobile_no);
        $stmt->execute();
        $result = $stmt->get_result();

        if ($result->num_rows > 0) {
            $signup_error = "Mobile number already exists.";
        } else {
            $Password = password_hash($RawPassword, PASSWORD_BCRYPT);
            $stmt = $con->prepare("INSERT INTO Signin (Name, Age, Mobile_no, Password) VALUES (?, ?, ?, ?)");
            $stmt->bind_param("siss", $Name, $Age, $Mobile_no, $Password);

            if ($stmt->execute()) {
                $_SESSION['signup_success'] = "Signup successful! Please login.";
                header("Location: index.html");
                exit;
            } else {
                $signup_error = "Something went wrong. Please try again.";
            }
        }
    }
}
?>
