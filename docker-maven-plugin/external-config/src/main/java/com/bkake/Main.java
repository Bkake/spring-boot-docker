package com.bkake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Main {

    @RequestMapping("/")
    public String home() throws UnknownHostException {
        return "Hello Docker World maven plug without external docker file " + "\n " +InetAddress.getLocalHost().getHostAddress();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}