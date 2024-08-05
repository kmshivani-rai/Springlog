package Javaproject.example.Newjava.Service;
import Javaproject.example.Newjava.model.User;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        User user = new User();
        user.setEmail(email); // Set the user's email

        // In a real application, you would look up the user by email and send a reset password email.
        // For this example, we just print a message.
      //  response.getWriter().println("If an account with the email " + " exists, a reset password link has been sent.");

        response.getWriter().println("If an account with the email " + user.getEmail() + " exists, a reset password link has been sent.");


    }

}
