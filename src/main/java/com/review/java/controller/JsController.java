package com.review.java.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsController {
    @RequestMapping("/")
    public String hellos(){
        System.out.println("调用了");
        return "hello";
    }
}
