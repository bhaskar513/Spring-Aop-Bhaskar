package com.bhaskar.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	
	// this is where we add all of advice logging
	
	// start @before advice
	
	@Before("execution( * com.bhaskar.aop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n ===> executing advice on addaccount()");
		
	}
}
