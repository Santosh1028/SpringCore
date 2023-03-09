package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotations/autoconfig.xml");
	    Emp emp=(Emp) context.getBean("emp");
	    
	    System.out.println(emp);
	}

}
