package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DbServices {
	@Autowired
	Db db;
	
	public void getData() {
	db.getDbData();
	}

}
