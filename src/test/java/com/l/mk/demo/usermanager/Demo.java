package com.l.mk.demo.usermanager;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.l.mk.demo.usermanager.model.Role;

public class Demo {

	@Test
	public void test() {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"config/spring/spring-usermanager-dao.xml");
		Role role = new Role();
		role.setType(0);
		role.setValue(1);
		
		SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(role);
		session.getTransaction().commit();
		
	}

}
