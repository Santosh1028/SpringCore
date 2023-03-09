package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
		Student student1 = (Student) context.getBean("emp1");
		
		System.out.println(student1.getName());
		System.out.println(student1.getPhones());
		System.out.println(student1.getAddress());
		System.out.println(student1.getCourses());
		
		System.out.println(student1.getPhones().getClass().getName());

	}

}
