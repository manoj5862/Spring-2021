package com.xworkz.component.FoodItem.repositery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.xworkz.component.FoodItem.entity.*;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	private SessionFactory factory;
    public FoodItemRepositoryImpl(SessionFactory factory) {
	this.factory = factory;
}
	
	@Override
	public void save(FoodItemEntity entity) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

}
