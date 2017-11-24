package com.paletter.stdy.spring.jdbc.basic;

import java.util.List;

import javax.sql.DataSource;

public interface UserDao {

	public void setDataSource(DataSource dataSource);
	public List<User> queryAll();
}
