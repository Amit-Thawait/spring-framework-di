package com.example.springframeworkdi;

import com.example.springframeworkdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Set;

@SpringBootApplication
public class SpringFrameworkDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkDiApplication.class, args);

		MyController myController = (MyController)ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("=================Property==============");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.sayGreeting());

		System.out.println("=================Setter==============");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.sayGreeting());

		System.out.println("=================Constructor==============");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.sayGreeting());

		System.out.println("=================Primary==============");

		PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");

		System.out.println(primaryController.sayGreeting());

		System.out.println("=================Profiles==============");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());
	}

}
