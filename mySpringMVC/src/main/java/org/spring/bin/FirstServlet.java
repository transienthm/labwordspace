package org.spring.bin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wangbin on 2017/2/2.
 */
public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hahahahahahah ");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("hello servlet");
    }
}
