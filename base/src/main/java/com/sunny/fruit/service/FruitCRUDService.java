package com.sunny.fruit.service;

import com.querydsl.core.types.Predicate;
import com.sunny.common.service.GeneralCRUDService;
import com.sunny.fruit.repository.Fruit;

import java.util.List;


public interface FruitCRUDService extends GeneralCRUDService {

    List<Fruit> findAllByPredicate(Predicate predicate);

    List<Fruit> findByFruitName(String fruitName);

}
