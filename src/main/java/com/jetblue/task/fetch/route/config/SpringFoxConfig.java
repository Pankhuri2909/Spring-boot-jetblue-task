package com.jetblue.task.fetch.route.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jetblue.task.fetch.route"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());
    }

    public ApiInfo apiDetails() {
        return new ApiInfo (
                "Address Book API",
                "API to fetch the routes",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Sample Task", "http://swagger.ui","a.c@.com"),
                "API License",
                "http://jetblue.com",
                Collections.emptyList()
        );
    }
}


