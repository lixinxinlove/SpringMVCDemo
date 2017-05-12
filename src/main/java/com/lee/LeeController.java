package com.lee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by android on 2017/5/11.
 */
@Controller
public class LeeController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response) {

        System.out.print("请求到达");

        return "admin/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginResponse(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request) {
        ModelAndView m = new ModelAndView();
        if (username.equals("zhaohongxuan") && password.equals("123")) {
            m.setViewName("index");
            return m;
        }
        m.setViewName("error");
        return m;
    }
}
