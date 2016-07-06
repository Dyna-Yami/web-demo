package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zkpk on 2016/7/6.
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, Model model) {
        model.addAttribute("name", name);

        return "hello";
    }

    @RequestMapping("/test")
    public String hello() {
        return "hello";
    }
}
