package com.xworkz.component.FoodItem.repositery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.xworkz.component.FoodItem.entity.*;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	
public FoodItemRepositoryImpl() {
	
}
	
	@Override
	public void save(FoodItemEntity entity) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

}
