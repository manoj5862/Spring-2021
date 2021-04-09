package com.xworkz.component.HotelVender.service;

import com.xworkz.component.HotelVender.entity.VendorEntity;
import com.xworkz.component.HotelVender.repositery.VendorRepository;

public class VenderServiceImpl1 implements VenderService1 {

	private VendorRepository vendo;
	
	public VenderServiceImpl1(VendorRepository vendo) {
		super();
		this.vendo = vendo;
	}

	@Override
	public void ValidateAndSave(VendorEntity entity) {
		if (entity!=null) {
			vendo.save(entity);
		}
		else {
			System.out.println("Cant save entity");
		}
	}

}
