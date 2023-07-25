package com.finalprojectbook.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.finalprojectbook.user"})
public class RecommendationBook {

    public static void main(String[] args) {
        SpringApplication.run(RecommendationBook.class, args);
    }

}
