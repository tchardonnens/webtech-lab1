package com.example.lab1;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.util.ArrayList;

@WebServlet(name = "ListItems", value = "/ListItems")
public class ListItems extends HttpServlet {
    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        ArrayList<String> items = (ArrayList<String>) session.getAttribute("items");
        if(items == null){
            items = new ArrayList<>();
        }
        items.add(request.getParameter("item"));
        session.setAttribute("items", items);
        //print the list of items
        try {
            response.setContentType("text/html");
            java.io.PrintWriter out = response.getWriter();
            out.print("<html><body>");
            for(String item : items){
                out.print("<p>" + item + "</p>");
            }
            out.print("</body></html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void destroy() {
    }

}
