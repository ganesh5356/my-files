<?php
session_start();
if (!isset($_SESSION['user'])) {
    header("Location: index.html");
    exit;
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="main-center">
        <h1 class="main-heading">Welcome, <?php echo htmlspecialchars($_SESSION['user']); ?>!</h1>
        <div class="container">
            <h2>About This Website</h2>
            <p>Welcome to our Student Portal, a platform designed to help students manage their academic journey. This website provides a simple and secure way to register, login, and access personalized information. Our goal is to create a supportive environment where students can focus on their studies and connect with peers.</p>
            <a href="logout.php" class="logout-btn">Logout</a>
        </div>
    </div>
</body>
</html>
