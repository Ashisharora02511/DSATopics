package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env" ,havingValue = "dev")
public class DevDb  implements Db{

	@Override
	public String getDbData() {
		// TODO Auto-generated method stub
		return "Dev Db";
	}

}
