package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ProdDb implements Db {

	@Override
	public String getDbData() {
		// TODO Auto-generated method stub
		return "Prod db";
	}

}
