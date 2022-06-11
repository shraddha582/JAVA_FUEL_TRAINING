package com.example.demowebApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demoweb2Application {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(Demoweb2Application.class, args);
		StudentDetails std;
		std=context.getBean(StudentDetails.class);
		std.setdata();
		std.showdata();
		
		
	}

}