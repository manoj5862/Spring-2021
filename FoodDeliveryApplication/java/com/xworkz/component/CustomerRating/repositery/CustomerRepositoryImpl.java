package com.xworkz.component.CustomerRating.repositery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.component.CustomerRating.entity.*;

public class CustomerRepositoryImpl implements CustomerRepository {
private SessionFactory factory;

	public CustomerRepositoryImpl(SessionFactory factory) {
		System.out.println("Created "+this.getClass().getSimpleName());
		this.factory = factory;
	}
	@Override
	public void save(CustomerEntity Entity) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(Entity);
		session.getTransaction().commit();
		session.close();
		
	}

	
}
