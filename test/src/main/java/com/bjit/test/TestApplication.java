package com.bjit.test;

import com.bjit.test.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:config.xml")
public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TestApplication.class, args);

		Coder c1= (Coder) context.getBean("coder1");
		System.out.println(c1.getName());
		System.out.println(c1.getComputer().getBrand());
	}
}
