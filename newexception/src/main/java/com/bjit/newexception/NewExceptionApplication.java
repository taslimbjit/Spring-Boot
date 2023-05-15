package com.bjit.newexception;

import com.bjit.newexception.model.Coder;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewExceptionApplication {

	public static void main(String[] args) {

		ApplicationContext context = (ApplicationContext) SpringApplication.run(NewExceptionApplication.class, args);

		Coder c1= context.getBean("sdfsdf");
	}

}
