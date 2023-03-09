package com.springcore.lifecyle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecyleTest {

	public static void main(String[] args) {

		 AbstractApplicationContext context=new
		  ClassPathXmlApplicationContext("com/springcore/lifecyle/lifecyleconfig.xml");
		 /*
		 * 
		 * Samosa samosa=(Samosa) context.getBean("samosa");
		 * 
		 * System.out.println(samosa); context.registerShutdownHook();
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * Pepsi pepsi=(Pepsi) context.getBean("pepsi"); System.out.println(pepsi); }
		 */
		 
		 Example example=(Example) context.getBean("ex");
		 System.out.println(example);

	}

}
