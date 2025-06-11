package com.example.demo.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/create")
    public String create() {
        return "create order " + port + " " + UUID.randomUUID().toString();
    }

    @RequestMapping("/order/index")
    public String index() {
        logger.info("accessing /order/index");
        return "hello world " + port + " " + UUID.randomUUID().toString();
    }
}