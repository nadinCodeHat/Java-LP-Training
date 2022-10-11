package com.spring.hw.docker.springboothelloworlddocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHelloworldDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldDockerApplication.class, args);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World running on Docker...";
    }
}
