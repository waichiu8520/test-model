package com.sunny.fruit.service;

import com.sunny.fruit.repository.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FruitServiceImpl implements FruitService {

    private FruitCRUDService fruitCRUDService;

    @Autowired
    public void setup(FruitCRUDService fruitCRUDService){
        this.fruitCRUDService = fruitCRUDService;
    }

    public void savea(){
        fruitCRUDService.save(new Fruit("apple","yellow"));
        fruitCRUDService.save(new Fruit("mango","red"));
        fruitCRUDService.save(new Fruit("waich","green"));
    }
}
