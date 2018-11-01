package com.sunny.nutrition.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NutritionRestController {


	@RequestMapping(value = "getq", method = RequestMethod.GET)
	public String get(){
		return "sssssssss";
	}

}
