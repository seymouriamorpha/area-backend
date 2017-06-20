package com.area.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Raman_Susla1
 * area-backend
 * 6/20/2017
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application
{
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "location-service");
        SpringApplication.run(Application.class, args);
    }
}
