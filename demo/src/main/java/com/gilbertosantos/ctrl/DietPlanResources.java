/**
 * Made to show my java , spring-boot skills 
 */
package com.gilbertosantos.ctrl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilbertosantos.dao.FoodService;
import com.gilbertosantos.model.Food;

/**
 * @author gilbertopsantosjr
 *
 */

@RestController
public class DietPlanResources {
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping( produces = "application/json", path =  "/my/food/today")
	public ResponseEntity<Food> findFoodOfToday() {
		
		Optional<Food> food = foodService.findMenuDay();
		
		if(food.isPresent())
			return new ResponseEntity<>(food.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
}
