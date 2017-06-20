package com.area.location.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Raman_Susla1
 * area-backend
 * 6/20/2017
 */
@RestController
public class LocationController
{
    @RequestMapping("/")
    public String home() {
        return "message";
    }
}
