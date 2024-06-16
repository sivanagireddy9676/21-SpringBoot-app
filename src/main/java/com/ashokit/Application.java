package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private Map<String,object> cache = new HashMap<String,object>()

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args); 
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//change  s for HIS-134
		int i=10;
		run.close();
	}
	//HIS-301 changes   
	public void loadDataToCache(){
		//logie
	}

}
