package com.feign.consumer.feignconsumer.controller;

import com.feign.consumer.feignconsumer.AlgoClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController
{
    @Autowired
    AlgoClientService algoClientService;

    @GetMapping("/stringpingfeign")
    public String pingStringController()
    {
        return algoClientService.getAlgoServiceMessage();
    }
}
