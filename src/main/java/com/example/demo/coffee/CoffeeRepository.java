package com.example.demo.coffee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>, CoffeeRepositoryCustom{

}
