package com.cpss.lighttools.papertranslate.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("translate")
    public String translateTest(){
        return "hello";
    }

}
