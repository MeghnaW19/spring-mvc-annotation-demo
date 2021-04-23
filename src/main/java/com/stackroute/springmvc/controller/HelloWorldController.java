package com.stackroute.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {
    /*
        handler methods
    */

    //TASK: find out the difference between Model, ModelMap and ModelAndView

    //http://localhost:8080/
    @GetMapping
    public String sayHello(Model model) {
        model.addAttribute("greeting", "Hello World");
        model.addAttribute("username", "John");
        return "welcome";
    }

    //http://localhost:8080/helloagain
    @GetMapping("/helloagain")
    public String sayHelloAgain(Model model) {
        model.addAttribute("greeting", "Hello World Again");
        return "index";
    }
}
