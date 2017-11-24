package com.paletter.stdy.spring.jdbc.routing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/paletter/stdy/spring/jdbc/routing/spring.xml");
		
		UserDao ud = app.getBean(UserDaoImpl.class);
		RoutingDataSource.setTargetDataSource("dataSource1");
		System.out.println(ud.queryAll().get(0).getName());
		RoutingDataSource.setTargetDataSource("dataSource2");
		System.out.println(ud.queryAll().get(0).getName());
	}
}
