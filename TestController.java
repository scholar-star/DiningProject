package busan.restaurants.controller;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "test", urlPatterns = "/test")
public class TestController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        String path = "/test2.html"; // WEB-INF에는 동작하지 않음. Thymeleaf를 제대로 배우고 나서 봐야 할 듯 하다.
        System.out.println("Hello World");
        RequestDispatcher dispatcher = req.getRequestDispatcher(path);
        // path에 대하여 가지고 오기
        dispatcher.forward(req, resp);
        // 요청했던 주소에다 그대로 전송
    }
}
