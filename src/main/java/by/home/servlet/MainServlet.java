package by.home.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("ko","Text");
        req.getRequestDispatcher("index.jsp").forward(req, resp);

        ServletContext ServletContext = getServletContext() ;
        ServletContext.getRequestDispatcher("/hello2").include(req, resp);

    }

}
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.print("<h1> Servlet</h1>");
//    }

//}