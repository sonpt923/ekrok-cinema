<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f7f7f7;
        }

        .container {
            display: flex;
            flex-direction: row;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
            max-width: 900px;
            width: 100%;
            background-color: #fff;
        }

        .image-container {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #e3f2fd;
        }

        .image-container img {
            max-width: 100%;
            height: auto;
        }

        .login-container {
            flex: 1;
            padding: 40px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        form {
            width: 100%;
        }

        .input-group {
            margin-bottom: 20px;
            width: 100%;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #666;
        }

        input[type="text"], input[type="password"] {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .options {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
        }

        .options label {
            display: flex;
            align-items: center;
        }

        .options a {
            color: #007bff;
            text-decoration: none;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #6366f1;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #4f46e5;
        }

        p {
            margin-top: 20px;
            color: #666;
        }

        .social-login {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-top: 10px;
        }

        .social-btn {
            padding: 10px 20px;
            border-radius: 4px;
            text-decoration: none;
            color: #fff;
            font-size: 14px;
        }

        .fb {
            background-color: #4267B2;
        }

        .twitter {
            background-color: #1DA1F2;
        }

        @media (max-width: 768px) {
            .container {
                flex-direction: column;
            }

            .image-container, .login-container {
                flex: none;
                width: 100%;
            }

            .login-container {
                padding: 20px;
            }
        }

    </style>
</head>
<body>
<div class="container">
    <div class="image-container">
        <img src="/theme/img/logo.png" alt="Background Image">
    </div>
    <div class="login-container">
        <h2>Login to continue</h2>
        <form action="${url.loginAction}" method="post">
            <div class="input-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="options">
                <label>
                    <input type="checkbox" name="remember"> Remember me
                </label>
                <a href="#">Forgot Password?</a>
            </div>
            <button type="submit">Login</button>
            <p>or sign up using</p>
        </form>
    </div>
</div>
</body>
</html>
