package com.sunny.fruit.repository;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer fruitId;

    private String fruitName;

    private String fruitColor;

    public Integer getFruitId() {
        return fruitId;
    }

    public void setFruitId(Integer fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }
}
