package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.domain.FormDetails;

@Repository
public class HelloDao {
@Autowired
private JdbcTemplate jdbcTemplate;
public int regi(FormDetails form){
	int count=jdbcTemplate.update("insert into login values(?,?,?,?)",form.getName(),form.getUserName(),form.getPassword(),form.getMobile());
	return count;
}
	
	
	
}
