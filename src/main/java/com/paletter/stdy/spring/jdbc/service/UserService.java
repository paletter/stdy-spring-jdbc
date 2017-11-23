package com.paletter.stdy.spring.jdbc.service;

import java.util.List;

import com.paletter.stdy.spring.jdbc.entity.User;

public interface UserService {

	public String getName();
	public List<User> queryAll();
}
