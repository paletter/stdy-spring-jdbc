package com.paletter.stdy.spring.jdbc.dao;

import java.util.List;

import com.paletter.stdy.spring.jdbc.entity.User;

public interface UserDao {

	public String name();
	public List<User> queryAll();
}
