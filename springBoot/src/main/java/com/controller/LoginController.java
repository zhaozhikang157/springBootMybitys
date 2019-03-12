package com.controller;

import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登陆
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public String login(String name,String pwd){
        String s = loginService.login(name,pwd);
        System.out.println("--------登陆成功---返回值："+s+"-----");
        return "登陆成功";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping("/toLogin")
    public String toLogin(){
        return "user/login";
    }
}
