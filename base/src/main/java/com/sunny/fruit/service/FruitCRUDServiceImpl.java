package com.sunny.fruit.service;

import com.sunny.fruit.repository.Fruit;
import com.sunny.fruit.repository.FruitRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FruitCRUDServiceImpl implements FruitCRUDService {

    private FruitRespository fruitRespository;

    @Autowired
    public void setup(FruitRespository fruitRespository){
        this.fruitRespository = fruitRespository;
    }

    public Object save(Object entity){
        return fruitRespository.save((Fruit) entity);
    }

}
