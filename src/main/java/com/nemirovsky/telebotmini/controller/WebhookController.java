package com.nemirovsky.telebotmini.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

@RestController
public class WebhookController {

    @PostMapping("/")
    public String updateReceived(@RequestBody String requestBody) {

        //TODO: del
        System.out.println("Incoming POST request: " + requestBody);

        return "И что же вы имеете в виду под \"" + requestBody + "\"?";

    }

    @GetMapping("/")
    public String get(HttpServletRequest request) {

        System.out.println("Incoming GET request! ");

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + ": " + value);
        }

        return "<h1><center>This is Telebot-mini v1.1 (AWS) testing center</center></h1>";
    }
}
