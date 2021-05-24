package com.pluralsight.democonferencedemo.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {
	
	private Logger logger = Logger.getLogger(ExceptionAspect.class.getName());
	
	@AfterThrowing(pointcut = "@annotation(com.pluralsight.democonferencedemo.annotations.ExceptionExpected)", throwing = "exception")
	 public void processException(RuntimeException exception) throws Throwable{
		 logger.severe(exception.getMessage());
	 }

}
