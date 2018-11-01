package com.sunny.fruit.service;

import com.sunny.common.response.APIResponse;
import com.sunny.fruit.form.FruitSearchForm;
import com.sunny.fruit.repository.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class FruitAPIServiceImpl implements FruitAPIService{

	private FruitService fruitService;

	@Autowired
	public void setup(FruitService fruitService){
		this.fruitService = fruitService;
	}

	public APIResponse get(FruitSearchForm fruitSearchForm){

		List<Fruit> fruitList = fruitService.get(fruitSearchForm);


		return new APIResponse("",
				null,
				fruitList);
	}
}
