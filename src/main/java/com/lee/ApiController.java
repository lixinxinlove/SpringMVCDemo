package com.lee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by android on 2017/5/11.
 */
@Controller
public class ApiController {

    @RequestMapping(value = "api/list", method = RequestMethod.GET)
    public String list(HttpServletRequest request, HttpServletResponse response) {
        System.out.print("请求到达");
        return "admin/login";
    }
}
