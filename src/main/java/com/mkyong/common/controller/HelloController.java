package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";// /WEB-INF/pages/hello.jsp

    }

    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public ModelAndView displayNewView() {
        ModelAndView andView = new ModelAndView("hello");
        andView.addObject("m", "sdfsdfsdfsdf");
        return andView;
    }
}