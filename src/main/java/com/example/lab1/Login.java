package com.example.lab1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/FormServlet", "/Form_Servlet"})
public class Login extends HttpServlet {
    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table>");
        out.println("<tr><td>First Name</td><td>" + request.getParameter("first_name") + "</td></tr>");
        out.println("<tr><td>Last Name</td><td>" + request.getParameter("last_name") + "</td></tr>");
        out.println("<tr><td>Birth date</td><td>" + request.getParameter("birth_date") + "</td></tr>");
        out.println("<tr><td>Gender</td><td>" + request.getParameter("gender") + "</td></tr>");
        out.println("<table>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}