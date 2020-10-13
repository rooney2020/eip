/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.controller;

import com.kingland.firstspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author KSC
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/app/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "wang") String name, @RequestParam(value = "lang", defaultValue = "en") String lang) {
        return helloService.hello(name, lang);
    }
}
