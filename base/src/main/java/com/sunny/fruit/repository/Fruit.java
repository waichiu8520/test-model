package com.sunny.fruit.repository;

import com.sunny.nutrition.repository.Nutrition;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer fruitId;

    @Column(length = 20)
    private String fruitName;

    @Column(length = 20)
    private String fruitColor;


    @OneToMany(
            mappedBy = "fruit",
            cascade = CascadeType.ALL
    )
    private List<Nutrition> nutritions;


    public Fruit(){}

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
