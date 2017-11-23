package com.paletter.stdy.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paletter.stdy.spring.jdbc.service.UserService;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		
		UserService service = app.getBean(UserService.class);
		System.out.println(service.getName());
		
		DataSource ds = app.getBean("dataSource", DataSource.class);
		System.out.println(service.queryAll());
	}
}
