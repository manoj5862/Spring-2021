package com.xworkz.component.CustomerRating.tester;

import com.xworkz.component.constant.FoodType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.component.CustomerRating.entity.CustomerEntity;
import com.xworkz.component.CustomerRating.repositery.CustomerRepositoryImpl;
import com.xworkz.component.CustomerRating.service.CustomerService;


public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity customerEntity = new CustomerEntity(2, "Manoj", 4.5, "Bangalore", FoodType.DESSERTS, 80.00);
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("meta-info.xml" , "SessionFactoryInit.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        customerService.ValidateAndSave(customerEntity);
	}

}
