package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

/**
 * @author zhai
 * @date 2018/9/13 19:10
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/a")
    public void testString(){
        System.out.println("AAAAAAAAAAA");
    }

}
