package com.imooc.luckmony.controller;

import com.imooc.luckmony.dto.LimitConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

     @Autowired
     private LimitConfigDto limitConfigDto;

    @GetMapping("/hello")
    public String say(){
        return "minMoney"+limitConfigDto.getDescription();
    }
}
