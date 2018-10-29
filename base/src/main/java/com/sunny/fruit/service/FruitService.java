package com.sunny.fruit.service;

import com.sunny.fruit.form.FruitSearchForm;
import com.sunny.fruit.repository.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> get(FruitSearchForm fruitSearchForm);
}
