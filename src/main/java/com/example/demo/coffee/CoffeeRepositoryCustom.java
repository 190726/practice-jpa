package com.example.demo.coffee;

import java.util.List;

public interface CoffeeRepositoryCustom {
	
	List<Coffee> findbyName(String name);

}
