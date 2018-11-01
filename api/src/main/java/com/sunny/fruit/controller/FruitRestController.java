package com.sunny.fruit.controller;

import com.sunny.common.response.APIResponse;
import com.sunny.fruit.form.FruitSearchForm;
import com.sunny.fruit.service.FruitAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class FruitRestController {

    private FruitAPIService fruitAPIService;

    @Autowired
    public void setup(FruitAPIService fruitAPIService){
        this.fruitAPIService = fruitAPIService;
    }

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public APIResponse get(@Valid @RequestBody FruitSearchForm fruitSearchForm){
        return fruitAPIService.get(fruitSearchForm);
    }
}