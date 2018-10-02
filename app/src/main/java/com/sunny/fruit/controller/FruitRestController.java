package com.sunny.fruit.controller;

import com.sunny.fruit.service.FruitAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitRestController {

    private FruitAPIService fruitAPIService;

    @Autowired
    public void setup(FruitAPIService fruitAPIService){
        this.fruitAPIService = fruitAPIService;
    }

    @RequestMapping(value = "fruittest", method = RequestMethod.POST)
    public void fruittest(){

    }

}
