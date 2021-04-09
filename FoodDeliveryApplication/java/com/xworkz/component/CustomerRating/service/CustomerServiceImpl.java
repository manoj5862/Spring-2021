package com.xworkz.component.CustomerRating.service;

import com.xworkz.component.CustomerRating.service.*;
import com.xworkz.component.CustomerRating.repositery.*;
import com.xworkz.component.CustomerRating.entity.*;

public class CustomerServiceImpl implements CustomerService {
private CustomerRepository customerRepo;

	public CustomerServiceImpl(CustomerRepository customerRepo) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	this.customerRepo = customerRepo;
}

	@Override
	public void ValidateAndSave(CustomerEntity customerEntity) {
		System.out.println("Invoked ValidateAndSave Method");
		if(customerEntity !=null) {
			System.out.println("Can Save Entity");
			customerRepo.save(customerEntity);
		}else {
			System.out.println("Can't Save the Entity");
		}
		
	}

}
