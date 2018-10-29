package com.sunny.fruit.form;

import java.io.Serializable;

public class FruitSearchForm implements Serializable {

	private String fruitName;

	public FruitSearchForm() {}

	public FruitSearchForm(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
}
