package by.home.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import static java.lang.System.out;
import static java.lang.System.setErr;


public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        enumerationParamGet(req, resp);
        dispatcher(resp, req);

        ServletContext ServletContext = getServletContext();
        ServletContext.getRequestDispatcher("/hello2").include(req, resp);

    }

    //    private void session(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        HttpSession session = req.getSession();
//        session.setAttribute("user1", 1001);
//        String str = (String) session.getAttribute("user1");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.print(str);
//    }
    private void enumerationParamGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Enumeration<String> param = req.getHeaders("s");
        String s = req.getParameter("str");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print(s);
    }

    private void dispatcher(HttpServletResponse resp, HttpServletRequest req) throws ServletException, IOException {
        req.setAttribute("ko", "Text");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.print("<h1> Servlet</h1>");
//    }

//}