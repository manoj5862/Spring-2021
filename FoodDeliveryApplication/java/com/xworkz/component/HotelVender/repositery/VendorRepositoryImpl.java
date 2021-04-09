package com.xworkz.component.HotelVender.repositery;

import com.xworkz.component.CustomerRating.entity.*;
import com.xworkz.component.HotelVender.entity.VendorEntity;

public class VendorRepositoryImpl implements VendorRepository {
	
public VendorRepositoryImpl() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
	@Override
	public void save(VendorEntity entity) {
		System.out.println("Invoked Save Method");
		
	}

}
