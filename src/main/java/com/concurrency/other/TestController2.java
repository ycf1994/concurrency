package com.concurrency.other;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController2 {

    @RequestMapping("/test2")
    @ResponseBody
    public String test(){
        return "test2";
    }
}
