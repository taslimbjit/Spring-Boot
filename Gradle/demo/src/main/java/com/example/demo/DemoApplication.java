package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	 @Autowired
	 Demo ob;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		DemoApplication demoApplication=new DemoApplication();
		demoApplication.show();
	}
	void show(){
		System.out.println(ob.str);
	}

}
