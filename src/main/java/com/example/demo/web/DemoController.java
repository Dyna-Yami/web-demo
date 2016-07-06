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

    @RequestMapping("/login")
    public String login(String name, Model model) {
        model.addAttribute("name", name);

        return "hello";
    }

    /**
     * 静态资源默认路径为/WEB-INF/resources,classpath:/static
     * 使用Thymeleaf模板引擎后，return的字符串解析的根路径为classpath:/templates
     * 而且默认.html后缀
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
