package com.sunny.fruit.repository;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer fruitId;

    @Column(length = 5)
    private String fruitName;

    private String fruitColor;

    public Fruit(String fruitName, String fruitColor) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
    }

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
