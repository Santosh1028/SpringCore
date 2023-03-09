package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main(String[] args) {
		
		/*
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml"); Person
		 * person=(Person)context.getBean("person");
		 * 
		 * System.out.println(person);
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Addition addition=(Addition)context.getBean("add");
		
		addition.doSum();
		
		

	}

}
