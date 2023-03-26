package com.example.lab1.mvc.controller;

import com.example.lab1.mvc.model.Person;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "Controller", value = "/Controller")
public class Controller extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = new Person(
                request.getParameter("first_name"),
                request.getParameter("last_name"),
                request.getParameter("birth_date"),
                request.getParameter("gender")
        );

        Date constantDate = null;
        try {
            constantDate = new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(person.getBirthDay());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int ageGap = birthDate.compareTo(constantDate);

        request.setAttribute("person", person);

        RequestDispatcher dispatcher;
        if (ageGap > 0) {
            dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/young.jsp");
        }
        else {
            dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/old.jsp");
        }
        dispatcher.include(request, response);


    }
}
