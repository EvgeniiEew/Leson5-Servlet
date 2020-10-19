package by.home.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet Two", urlPatterns = {"/hello2"})
public class ServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter pr = resp.getWriter();
        pr.print("ServletTWO from javaClassTwo");
        HttpSession session = request.getSession();
        session.setAttribute("user1", "1001");
        String str = (String) session.getAttribute("user1");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print( str.concat("----------"));
    }
}
