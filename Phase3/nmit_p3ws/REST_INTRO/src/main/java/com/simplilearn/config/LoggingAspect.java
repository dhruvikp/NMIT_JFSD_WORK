package com.simplilearn.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.simplilearn.service.*.*(..))")
	public void logBefore() {
		System.out.println("Before method execution");	
	}
	
	@AfterReturning(
		pointcut="execution(* com.simplilearn.service.*.*(..)",
		returning="result"
			
	)
	public void logAfter(Object result) {
		System.out.println("Result : "+result);
	}
	
	@Around("execution(* com.simplilearn.service.*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before Execution");
		
		long start = System.currentTimeMillis();
		
		Object result = joinPoint.proceed(); // Call actual method
		
		long end = System.currentTimeMillis();
		
		System.out.println("After execution");
		System.out.println("Time taken: "+ (end-start));
		return result;
	}
}
