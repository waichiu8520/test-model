package com.sunny.nutrition.repository;

import com.sunny.fruit.repository.Fruit;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Nutrition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer nutritionId;

	@Column(length = 150)
	private String description;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fruitId", nullable = false, referencedColumnName = "fruitId")
	private Fruit fruit;

	public Integer getNutritionId() {
		return nutritionId;
	}

	public void setNutritionId(Integer nutritionId) {
		this.nutritionId = nutritionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
