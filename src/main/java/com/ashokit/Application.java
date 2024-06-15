package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args); 
		  
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//changes for HIS-134
		run.close();
 
	}
	//HIS-200 related changes
	public void doProcess()
	{
		//logic goes here
	}

}
