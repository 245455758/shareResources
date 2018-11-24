package com.trouble.shareresources.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("name", "testcc");
        return "login";
    }

    @RequestMapping("/fail")
    public String failLogin(Model model){
        return "fail";
    }

//    @RequestMapping("/error")
//    public ResultType getError(){
//        return new ResultType(false,"there is an error!!!!");
//    }

}
