package com.paletter.stdy.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.paletter.stdy.spring.jdbc.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		System.out.println("-=----------------------------------");
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public String name() {
		return "FangBo";
	}
	
	@Override
	public List<User> queryAll() {
		return jdbcTemplate.query("select * from user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}
}
