package com.xworkz.component.HotelVender.repositery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.xworkz.component.HotelVender.entity.VendorEntity;

public class VendorRepositoryImpl implements VendorRepository {
	
	private SessionFactory factory;
	
public VendorRepositoryImpl(SessionFactory factory) {
	System.out.println("Created "+this.getClass().getSimpleName());
	this.factory = factory;
}
	@Override
	public void save(VendorEntity entity) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

}
