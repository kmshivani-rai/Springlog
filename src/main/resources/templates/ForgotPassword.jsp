<!DOCTYPE html>
<html>
<head>
    <title>Forgot Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .forgot-password-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .forgot-password-container h2 {
            margin-bottom: 20px;
        }
        .forgot-password-container label {
            display: block;
            margin-bottom: 5px;
        }
        .forgot-password-container input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .forgot-password-container button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
        }
    </style>
</head>
<body>
<div class="forgot-password-container">
    <h2>Forgot Password</h2>
    <form action="ForgotPasswordServlet" method="post">
        <label for="email">Enter your email address:</label>
        <input type="email" id="email" name="email" required>

        <button type="submit">Reset Password</button>
    </form>
</div>
</body>
</html>
