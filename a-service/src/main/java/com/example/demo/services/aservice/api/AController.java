package com.example.demo.services.aservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AController {


	@Autowired
	CoffeeUseCase coffeeProvider;

	@RequestMapping(value = "/sayHello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String sayHello() {
		return  "Hello World " + coffeeProvider.order();
	}

}
