package com.paletter.stdy.spring.jdbc.basic;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<User> queryAll() {
		return jdbcTemplate.query("select * from user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}
}
