package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.HelloDao;
import com.nit.domain.FormDetails;

@Service
public class HelloService {
@Autowired
private HelloDao helloDao;
public int regi(FormDetails form){
	int count=helloDao.regi(form);
	return count;
	
}
	
	
}
