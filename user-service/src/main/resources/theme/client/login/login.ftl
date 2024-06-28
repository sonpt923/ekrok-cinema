<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Client Login</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="login-container">
    <h1>Client Login</h1>
    <form action="${url.loginAction}" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>
