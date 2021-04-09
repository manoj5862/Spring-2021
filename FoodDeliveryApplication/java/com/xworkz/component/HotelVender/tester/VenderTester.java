package com.xworkz.component.HotelVender.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.component.HotelVender.entity.VendorEntity;
import com.xworkz.component.HotelVender.service.VenderService1;
import com.xworkz.component.constant.FoodType;
import com.xworkz.component.HotelVender.service.VenderServiceImpl1;

public class VenderTester {
	public static void main(String[] args) {
		VendorEntity entity = new VendorEntity(1, "vinod", "Udupi", FoodType.SOUTHINDIAN , 40);
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("meta-info.xml" , "SessionFactoryInit.xml");
		VenderService1 venderService1 = applicationContext.getBean(VenderService1.class);
		venderService1.ValidateAndSave(entity);
	}
	
}
