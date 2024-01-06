package com.aswin.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service dao = (Service)context.getBean(Service.class);
		dao.save();
		context.close();
	}
}
