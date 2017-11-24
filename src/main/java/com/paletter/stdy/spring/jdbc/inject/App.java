package com.paletter.stdy.spring.jdbc.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/paletter/stdy/spring/jdbc/inject/spring.xml");
		
		UserDao dao = app.getBean(UserDaoImpl.class);
		System.out.println(dao.queryAll().get(0).getName());
	}
}
