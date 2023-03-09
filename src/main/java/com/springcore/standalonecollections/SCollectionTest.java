package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SCollectionTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalonecollections/standaloneconfig.xml");
		Person p = context.getBean("p1", Person.class);

		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println(p.getFeesstructure());
		System.out.println(p.getFeesstructure().getClass().getName());
		
		System.out.println(p.getProperties());
	}

}
