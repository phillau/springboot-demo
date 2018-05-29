package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BaseController {
    @RequestMapping("/login")
    public String index(){
        return "login";
    }
}
