package com.meituan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wangbin on 2017/11/12.
 */
public class HelloWorld extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("hello world init()..........");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf8");
        PrintWriter out = resp.getWriter();
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        out.println("hello world");
    }
}
