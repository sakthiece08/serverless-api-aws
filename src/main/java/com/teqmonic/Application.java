package com.teqmonic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// We use direct @Import instead of @ComponentScan to speed up cold starts

//@ComponentScan(basePackages = "com.teqmonic")
 // @Import({ PingController.class, ProductController.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}