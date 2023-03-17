package com.example.lab1;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ShowSession", value = "/ShowSession")
public class ShowSession extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            //count the number of visits
            HttpSession session = request.getSession();
            if (session.getAttribute("count_visits") == null) {
                response.setContentType("text/html");
                java.io.PrintWriter out = response.getWriter();
                out.print("Welcome on my site");
                session.setAttribute("count_visits", 1);
                out.close();
            }
            else{
                String full_name = (String) session.getAttribute("full_name");
                response.setContentType("text/html");
                java.io.PrintWriter out = response.getWriter();
                out.print("Welcome back : you came " + session.getAttribute("count_visits") + " times");
                session.setAttribute("count_visits", (int) session.getAttribute("count_visits") + 1);
                out.close();
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void destroy() {
    }
}
