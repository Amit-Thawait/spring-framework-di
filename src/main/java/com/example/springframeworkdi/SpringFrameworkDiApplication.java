package com.example.springframeworkdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkDiApplication.class, args);

		MyController myController = (MyController)ctx.getBean("myController");

		System.out.println(myController.sayHello());
	}

}
