<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;

            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .login-container h2 {
            margin-bottom: 20px;
        }
        .login-container label {
            display: block;
            margin-bottom: 5px;
        }
        .login-container input[type="email"],
        .login-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .login-container button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
        }
        .login-container a {
            display: block;
            margin-top: 10px;
            text-align: center;
            color: #4CAF50;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2> <!--LoginServlet-->
    <form action="#" method="" id="frm">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button  onclick="save();">Login</button>
    </form>
<!--    <a href="ForgotPassword.jsp">Forgot Password?</a>-->
</div>
</body>
<script>
    function save()
    {
        var form=("#frm")[0];
        var data=new FormData(form);
        $.ajax({
            url: '/rest/saveData', // The URL to the PHP script that will handle the form data
            type: 'POST',
            data: data, // Serialize the form data
            success: function(response){
                // Display the response from the server
                // window.location="formPage.jsp";


                $("#response").html("<p>" + response + "</p>");
            },
            error: function(xhr, status, error){
                // Handle any errors that occurred during the request
                console.error("Error: " + status + " - " + error);
                $("#response").html("<p>An error occurred: " + error + "</p>");
            }
        });
       /* var email=$("#email").val();
        var password=$("#password").val();

        window.location="/rest/saveData?email="+email+"&password="+password;*/

    }
</script>
</html>
