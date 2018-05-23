package com.vedatech.admin.controller.bankcontroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/main")
    public String message(){

        return "Hello World";
    }
}
