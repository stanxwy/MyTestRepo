package com.example.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/create")
    public String create() {
        return "create order " + port + " " + UUID.randomUUID().toString();
    }

    @RequestMapping("/order/index")
    public String index() {
        return "index " + port + " " + UUID.randomUUID().toString();
    }
}