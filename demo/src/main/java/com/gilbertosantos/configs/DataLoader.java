package com.gilbertosantos.configs;

import java.time.DayOfWeek;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.gilbertosantos.dao.FoodRepository;
import com.gilbertosantos.model.Food;
import com.gilbertosantos.model.MenuDay;

@Component
@Profile({ "DEV", "TEST", "QA" })
public class DataLoader implements ApplicationRunner {

	@Autowired
    private FoodRepository foodRepository;


	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Food foodMonday = new Food();
		foodMonday.setDays(DayOfWeek.MONDAY);
		foodMonday.setMenu( Arrays.asList( new MenuDay(" Fish and Brocolis "), new MenuDay(" Rice and Beans ") ) );
		
		foodRepository.save(foodMonday);
		
		Food foodTuesday = new Food();
		foodTuesday.setDays(DayOfWeek.TUESDAY);
		foodTuesday.setMenu( Arrays.asList( new MenuDay(" Beef and Tomato "), new MenuDay(" eggs and vegetables ") ) );
		
		foodRepository.save(foodTuesday);
		
		Food foodWednesday = new Food();
		foodWednesday.setDays(DayOfWeek.WEDNESDAY);
		foodWednesday.setMenu( Arrays.asList( new MenuDay(" chicken and vegetables "), new MenuDay(" cesar salad ") ) );
		
		foodRepository.save(foodWednesday);
		
		Food foodTursday = new Food();
		foodTursday.setDays(DayOfWeek.THURSDAY);
		foodTursday.setMenu( Arrays.asList( new MenuDay(" beef and brocolis "), new MenuDay(" Rice and Beans ") ) );
		
		foodRepository.save(foodTursday);
		
		Food foodFriday = new Food();
		foodFriday.setDays(DayOfWeek.FRIDAY);
		foodFriday.setMenu( Arrays.asList( new MenuDay(" Pizza Day "), new MenuDay(" Free day ") ) );
		
		foodRepository.save(foodFriday);
	
		
	}
}
