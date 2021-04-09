package com.xworkz.component.CustomerRating.repositery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.component.CustomerRating.entity.*;

public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	@Override
	public void save(CustomerEntity Entity) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(Entity);
		session.getTransaction().commit();
		session.close();
		
	}

	
}
