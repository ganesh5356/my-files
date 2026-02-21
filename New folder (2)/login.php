<?php
session_start();
$con = mysqli_connect('localhost', 'root', '', 'logindbs');
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

if (isset($_POST['login'])) {
    $Mobile = trim($_POST['login_mobile']);
    $Password = $_POST['login_password'];

    $stmt = $con->prepare("SELECT * FROM Signin WHERE Mobile_no = ?");
    $stmt->bind_param("s", $Mobile);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($row = $result->fetch_assoc()) {
        if (password_verify($Password, $row['Password'])) {
            $_SESSION['user'] = $row['Name'];
            $_SESSION['login_success'] = true;
            header("Location: about.php");
            exit;
        } else {
            $login_error = "Invalid credentials.";
        }
    } else {
        $login_error = "User not found.";
    }
}
?>
