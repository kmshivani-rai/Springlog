<!DOCTYPE html>
<html>
<head>
  <title>Form Page</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .form-container {
      background-color: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .form-container h2 {
      margin-bottom: 20px;
    }
    .form-container label {
      display: block;
      margin-bottom: 5px;
    }
    .form-container input[type="text"],
    .form-container input[type="email"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    .form-container button {
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
<div class="form-container">
  <h2>Submit Your Details</h2>
  <form action="SubmitFormServlet" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="email">Email ID:</label>
    <input type="email" id="email" name="email" required>

    <label for="phone">Phone Number:</label>
    <input type="text" id="phone" name="phone" required>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>

    <label for="pincode">Pin Code:</label>
    <input type="text" id="pincode" name="pincode" required>

    <label for="city">City:</label>
    <input type="text" id="city" name="city" required>

    <label for="country">Country:</label>
    <input type="text" id="country" name="country" required>

    <button type="submit">Submit</button>
  </form>
</div>
</body>
</html>
