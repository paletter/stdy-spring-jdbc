package com.paletter.stdy.spring.jdbc.routingaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/paletter/stdy/spring/jdbc/routingaop/spring.xml");
		
		UserDao ud = app.getBean(UserDaoImpl.class);
		System.out.println(ud.queryAll().get(0).getName());
	}
}
