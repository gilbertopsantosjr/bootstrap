package com.gilbertosantos.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.gilbertosantos.DemoApplication;
import com.gilbertosantos.dao.FoodService;
import com.gilbertosantos.model.Food;


@SpringBootTest(classes = DemoApplication.class)
@ActiveProfiles("TEST")
class DemoApplicationTests {

	@Autowired
	FoodService foodService;
	
	@Test
	void contextLoads() {
	}
	

	@Test
	void testWhetherFoodIsReturnByToday() {
		 Optional<Food> findMenuDay = foodService.findMenuDay();
		 assertNotNull(findMenuDay.get());
	}

}
