package com.area.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Raman_Susla1
 * area-backend
 * 6/20/2017
 */
@SpringBootApplication
@EnableEurekaServer
public class Application
{
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "registration-service");
        SpringApplication.run(Application.class, args);
    }
}
