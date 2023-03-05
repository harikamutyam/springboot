package com.harika.restful.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by harika on 3/4/23.
 */
@RestController
public class HarikaSareesController {

    @GetMapping("/getSarees")
    public String getSareesFromBackend() {
        // ddb call
        return "Sarees types endpoint 3";
    }

    @GetMapping("/getPrice")
    public String getPriceFromBackend() {
        // ddb call
        return "price endpoint  3";
    }




}
