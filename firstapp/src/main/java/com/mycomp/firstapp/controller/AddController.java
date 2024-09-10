package com.mycomp.firstapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.firstapp.pojo.AddRequest;

@RestController
public class AddController {
    
    @PostMapping("/add")
    public int add(@RequestBody AddRequest request) {
        int num1 = request.getNum1();
        int num2 = request.getNum2();
        
        System.out.println("Incoming objects values are " + "||num1: "+ num1 + "||num2: "+ num2);
        
        int sum = num1 + num2;
        
        System.out.println("Sum = " + sum);
        
        return sum;
    }
}
