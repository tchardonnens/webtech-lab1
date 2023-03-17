package com.example.lab1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Visits", value = "/Visits")
public class Visits extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Cookie[] cookies = request.getCookies();
        //read the value of the cookie called clickCount or create it if it doesn't exist
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("clickCount")){
                    int clickCount = Integer.parseInt(c.getValue());
                    clickCount++;
                    c.setValue(String.valueOf(clickCount));
                    response.addCookie(c);
                }
                else {
                    Cookie clickCountCookie = new Cookie("click_count", "1");
                    clickCountCookie.setMaxAge(60 * 60 * 24);
                    clickCountCookie.setDomain("localhost");
                    clickCountCookie.setPath("/");
                    response.addCookie(clickCountCookie);
                }
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
        dispatcher.forward(request, response);
    }
    public void destroy() {
    }
}
