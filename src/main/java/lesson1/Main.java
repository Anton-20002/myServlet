package lesson1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Paths;

/**
 * Created by Anton on 16.09.2018.
 */
@WebServlet( value = "/main")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        String search = req.getParameter("search");

        try (PrintWriter out = new PrintWriter(resp.getWriter(), true)){
        out.println("You are looking for ... "+ search);

//        RequestDispatcher view = req.getRequestDispatcher("resources/Register.html");
//        view.forward(req, resp);
        }


    }


}
