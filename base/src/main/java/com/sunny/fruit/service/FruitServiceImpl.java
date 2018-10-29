package com.sunny.fruit.service;

import com.sunny.fruit.form.FruitSearchForm;
import com.sunny.fruit.repository.Fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class FruitServiceImpl implements FruitService {

    private FruitCRUDService fruitCRUDService;

    @Autowired
    public void setup(FruitCRUDService fruitCRUDService){
        this.fruitCRUDService = fruitCRUDService;
    }

    public List<Fruit> get(FruitSearchForm fruitSearchForm){
        return fruitCRUDService.findByFruitName(fruitSearchForm.getFruitName());
    }

    /*public Predicate buildWhereClause(){
        QFruit fruit = QFruit.fruit;
        List<Predicate> whereClause = new ArrayList<>();
        whereClause.add(fruit.fruitName.eq("apple"));
        return ExpressionUtils.allOf(whereClause);
    }*/
}