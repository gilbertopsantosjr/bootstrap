package com.gilbertosantos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gilbertosantos.model.Food;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {

}
