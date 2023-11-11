package com.example.demo.coffee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import com.example.demo.QueryDslConfig;

@DataJpaTest
@Import(QueryDslConfig.class)
class CoffeeRepositoryCustomTest {
	
	@Autowired CoffeeRepository repository;

	@Test
	void findByName() {
		Coffee coffee1 = new Coffee("아이스아메리카노");
		Coffee coffee2 = new Coffee("핫아메리카노");
		Coffee coffee3 = new Coffee("아이스아메리라떼");
		Coffee coffee4 = new Coffee("핫아메리라떼");
		repository.saveAll(List.of(coffee1, coffee2, coffee3, coffee4));
		
		List<Coffee> findbyName = repository.findbyName("아이스아메리라떼");
		System.out.println(findbyName);
	}

}
