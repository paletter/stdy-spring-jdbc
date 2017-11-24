package com.paletter.stdy.spring.jdbc.basic;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/paletter/stdy/spring/jdbc/basic/spring.xml");
		
		DataSource ds = app.getBean("dataSource", DataSource.class);
		UserDao dao = app.getBean(UserDaoImpl.class);
		dao.setDataSource(ds);
		System.out.println(dao.queryAll().get(0).getName());
	}
}
