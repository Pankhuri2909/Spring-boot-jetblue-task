package com.jetblue.task.fetch.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:application.properties")
@SpringBootApplication
public class FetchroutesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FetchroutesApplication.class, args);
    }

}
