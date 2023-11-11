package com.example.demo.coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class CoffeeRepositoryCustomImpl implements CoffeeRepositoryCustom {

	@Autowired JPAQueryFactory jpaQueryFactory;
	
	@Override
	public List<Coffee> findbyName(String name) {
		
		QCoffee coffee = QCoffee.coffee;
		
		return jpaQueryFactory
			.selectFrom(coffee)
			.where(coffee.name.eq(name))
			.fetch();
	}
}