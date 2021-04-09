package com.xworkz.component.FoodItem.service;

import com.xworkz.component.FoodItem.entity.*;

import com.xworkz.component.FoodItem.repositery.*;

public class FoodItemServiceImpl implements FoodItemService {
private FoodItemRepository foodItemRep;

	public FoodItemServiceImpl(FoodItemRepository foodItemRep) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	this.foodItemRep = foodItemRep;
}


	@Override
	public void ValidationAndSave(FoodItemEntity entity) {
		System.out.println("Invoked ValidationAndSave method");
		if(entity != null) {
			System.out.println("Can Save Entity");
			foodItemRep.save(entity);
		}else {
			System.out.println("Can't save entity");
		}
	}

}
