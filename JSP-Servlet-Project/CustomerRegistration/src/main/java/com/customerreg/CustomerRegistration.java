package com.customerreg;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registercustomer")
public class CustomerRegistration extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // Get values from customer registration form
        String firstName = req.getParameter("firstname");
        String lastName = req.getParameter("lastname");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String email = req.getParameter("email");
        res.sendRedirect("successful.jsp");
    }
}
