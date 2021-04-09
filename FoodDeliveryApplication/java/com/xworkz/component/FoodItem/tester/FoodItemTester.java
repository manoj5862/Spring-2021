package com.xworkz.component.FoodItem.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.component.FoodItem.service.FoodItemService;
import com.xworkz.component.constant.*;


public class FoodItemTester {
public static void main(String[] args) {
	com.xworkz.component.FoodItem.entity.FoodItemEntity entity = new com.xworkz.component.FoodItem.entity.FoodItemEntity(2, "Masla Dosa", 160.00, 40, FoodType.SOUTHINDIAN);
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("meta-info.xml");
	FoodItemService foodItemService = applicationContext.getBean(FoodItemService.class);
	foodItemService.ValidationAndSave(entity);
	
}
}
