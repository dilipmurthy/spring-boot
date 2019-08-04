package com.demo.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomerAspect {

	@Pointcut("execution(* com.demo.spring.CustomerC*.processForm(..))")
	public void p() {}
	
	@Before("p()")
	public void before() {
		System.out.println("before customer controller...");
	}
	@After("p()")
	public void after() {
		System.out.println("after customre controller...");
	}
}
