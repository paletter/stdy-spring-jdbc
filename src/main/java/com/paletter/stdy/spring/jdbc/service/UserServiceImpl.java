package com.paletter.stdy.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paletter.stdy.spring.jdbc.dao.UserDao;
import com.paletter.stdy.spring.jdbc.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public String getName() {
		return userDao.name();
	}

	@Override
	public List<User> queryAll() {
		return userDao.queryAll();
	}

}
