package com.polaris.he.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * User: hexie
 * Date: 2019-01-25 21:01
 * Description:
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}