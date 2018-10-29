package com.sunny.fruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface FruitRespository extends JpaRepository<Fruit,Integer> , QuerydslPredicateExecutor<Fruit> {

	List<Fruit> findByFruitName(String fruitName);

}
