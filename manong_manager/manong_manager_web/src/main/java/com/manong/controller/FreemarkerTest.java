package com.manong.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Administrator
 * @create 2019/6/10 0010 下午 4:17
 */
public class FreemarkerTest {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("name","wistbean");
        return "hello";
    }

    @RequestMapping("/hi")
    public String sayHi(Model model){
        model.addAttribute("name","wistbean");
        return "hi";
    }
}
