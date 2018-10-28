package com.meituan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by wangbin on 2017/11/12.
 */
public class NotLoadOnStartup extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("NotLoadOnStartup.....");
    }
}
