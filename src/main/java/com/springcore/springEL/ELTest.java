package com.springcore.springEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ELTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springEL/elconfig.xml");
		Demo demo=context.getBean("demo", Demo.class);
		
		System.out.println(demo);
		
		/*
		 * SpelExpressionParser temp = new SpelExpressionParser(); Expression expression
		 * = temp.parseExpression("2+2"); System.out.println(expression.getValue());
		 */
		
		
	}

}
