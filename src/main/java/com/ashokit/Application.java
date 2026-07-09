package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private Map<String,object> cache = new HashMap<String,object>();

	public static void main(String[] args) {
		int a=20;
		int b=30;
		private static final String REST_URL="https://www.equifax.com/getScores";
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//changes for HIS-134
		int i=10;
		run.close();
 
	}
	//HIS-200 related changes
	public void doProcess()
	{
		//logic goes here
	}
	//HIS-301 changes   
	public void loadDataToCache(){
		//logie
	}

}
