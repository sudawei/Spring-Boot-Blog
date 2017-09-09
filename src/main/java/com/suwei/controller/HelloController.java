package com.suwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/9/009.
 */
@RestController

public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hi";
    }
}
