package com.paletter.stdy.spring.jdbc.routing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	@Autowired
	public void setTemplate(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}
	
	@Override
	public List<User> queryAll() {
		return getJdbcTemplate().query("select * from user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}
}
