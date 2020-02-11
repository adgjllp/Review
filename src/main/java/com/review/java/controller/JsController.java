package com.review.java.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JsController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name")String name ,Model model){
        model.addAttribute(name);
        return "helloWorld";

    }
}
