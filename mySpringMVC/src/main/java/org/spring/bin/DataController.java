package org.spring.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by wangbin on 2017/2/4.
 */
@Controller
public class DataController {

    @Autowired
    CharacterEncodingFilter filter;

    @RequestMapping(value = "data", method = RequestMethod.POST)
    public String hello(String name) {
        System.out.println(name);
        System.out.println(filter.getEncoding());
        return "redirect:data.jsp";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        System.out.println(id);
        System.out.println("***********");
        return "index.jsp";
    }
}
