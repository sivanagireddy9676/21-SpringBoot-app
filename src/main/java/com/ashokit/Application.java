package com.ashokit;

import java.util.Map;
import java.util.HashMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private Map<String,Object> cache = new HashMap<String,Object>();
	private static final String REST_URL="https://www.equifax.com/getScores";

	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//changes for HIS-134
		int i=10;
		run.close();
	}
	
	//HIS-200 related changes
	public void doProcess() {
		//logic goes here
	}
	
	//HIS-301 changes   
	public void loadDataToCache() {
		//logic
	}

}
