package com.example.lab1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/FormServlet", "/Form_Servlet"})
public class Login extends HttpServlet {
    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //create cookies
        Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
        Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
        Cookie birth_date = new Cookie("birth_date", request.getParameter("birth_date"));
        Cookie gender = new Cookie("gender", request.getParameter("gender"));

        //define the cookie's lifetime
        firstName.setMaxAge(60*60*24);
        lastName.setMaxAge(60*60*24);
        birth_date.setMaxAge(60*60*24);
        gender.setMaxAge(60*60*24);

        //define cookies domain as localhost
        firstName.setDomain("localhost");
        lastName.setDomain("localhost");
        birth_date.setDomain("localhost");
        gender.setDomain("localhost");

        //define cookies setPath as /
        firstName.setPath("/");
        lastName.setPath("/");
        birth_date.setPath("/");
        gender.setPath("/");

        response.addCookie(firstName);
        response.addCookie(lastName);
        response.addCookie(birth_date);
        response.addCookie(gender);

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