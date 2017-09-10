package org.spring.bin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangbin on 2017/2/1.
 */

@Controller
public class HelloController /*implements org.springframework.web.servlet.mvc.Controller*/ {

    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest req, HttpServletResponse response,String name) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "hello springmvc annotation");
        mv.setViewName("hello");
        System.out.println(name);
        return mv;
    }

    @RequestMapping("/servletapi")
    public void servletapi(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        resp.getWriter().println("hello servlet api");
    }

/*    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "hello springmvc xml");
        mv.setViewName("hello");
        return mv;
    }*/
}
