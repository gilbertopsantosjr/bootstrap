/**
 * 
 */
package com.gilbertosantos.dao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilbertosantos.model.Food;

/**
 * @author gilbertopsantosjr
 *
 */
@Service
public class FoodService {

	
	@Autowired
	private FoodRepository foodRepository;
	
	/**
	 * search for food which is allowed by today
	 * @return
	 */
	public Optional<Food> findMenuDay(){
		// today is ? 
		LocalDate localDate = LocalDate.now();
	     
	    //Getting the day of week for a given date
	    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		// filter  by today
	    Predicate<Food> foodOfTheDay = obj -> obj.getDays().equals(dayOfWeek); 
	    
		// return the MenuDay
	    return StreamSupport
	    	.stream(foodRepository.findAll().spliterator(), false)
	    	.filter(foodOfTheDay).findFirst();
	    
	}
}
