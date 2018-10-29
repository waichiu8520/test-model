package com.sunny.fruit.service;

import com.sunny.common.response.APIResponse;
import com.sunny.fruit.form.FruitSearchForm;

public interface FruitAPIService {

	APIResponse get(FruitSearchForm fruitSearchForm);

}
