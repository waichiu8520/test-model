package com.sunny.fruit.service;

import com.querydsl.core.types.Predicate;
import com.sunny.fruit.repository.Fruit;
import com.sunny.fruit.repository.FruitRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class FruitCRUDServiceImpl implements FruitCRUDService {

    private FruitRespository fruitRespository;

    @Autowired
    public void setup(FruitRespository fruitRespository){
        this.fruitRespository = fruitRespository;
    }


    @Override
    public List<Fruit> findAllByPredicate(Predicate predicate) {
        return StreamSupport.stream(fruitRespository.findAll(predicate).spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public List<Fruit> findByFruitName(String fruitName){
        return fruitRespository.findByFruitName(fruitName);
    }


    public Object save(Object entity){
        return fruitRespository.save((Fruit) entity);
    }

}
