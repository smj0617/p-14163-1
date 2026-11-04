package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("index() 메서드 호출됨!");

        return "메롱<span style='color: red;'>안녕</span>";
    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello() 메서드 호출됨!");

        return "HIHI";
    }
}