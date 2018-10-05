package com.sunny.fruit.controller;

import com.sunny.fruit.repository.Fruit;
import com.sunny.fruit.service.FruitAPIService;
import com.sunny.fruit.service.FruitCRUDService;
import com.sunny.fruit.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class FruitRestController {

    private FruitAPIService fruitAPIService;
    private FruitService fruitService;

    @Autowired
    public void setup(FruitAPIService fruitAPIService, FruitService fruitService){
        this.fruitAPIService = fruitAPIService;
        this.fruitService = fruitService;
    }

    @RequestMapping(value = "fruittest", method = RequestMethod.GET)
    public void fruittest(){
        fruitService.savea();
    }

}
