package com.demo.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SuppAspect {

	@Pointcut("execution(* com.demo.spring.SuppC*.processForm(..))")
	public void p() {}
	
	@Before("p()")
	public void beforeSupp() {
		System.out.println("before supp...");
	}
	
	@After("p()")
	public void afterSupp() {
		System.out.println("after supp...");
	}
}
