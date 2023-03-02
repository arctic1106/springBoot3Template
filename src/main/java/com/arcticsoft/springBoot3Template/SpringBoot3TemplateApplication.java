package com.arcticsoft.springBoot3Template;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot3TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3TemplateApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(PersonService personService) {
        return args -> {
            personService.create("Arctic1");
            personService.create("Arctic2");
            personService.create("Arctic3");
            var p = personService.read(1L);
            System.out.println(p);
        };
    }
}