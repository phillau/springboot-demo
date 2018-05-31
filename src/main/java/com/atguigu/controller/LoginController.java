package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(String username, String password, Model model, HttpSession session){
        if("admin".equals(username)&&"admin".equals(password)){
            session.setAttribute("user",username);
            return "dashboard";
        }
        model.addAttribute("msg","登录失败");
        return "login";
    }
}
