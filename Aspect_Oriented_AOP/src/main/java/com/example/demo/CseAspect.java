package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CseAspect {
   @Pointcut("execution(* com.example.demo.*.*(..))")
   public void p1()
   {
	   
   }

	
	  @Before("p1()") 
	   public void dispcse() { 
	  System.out.println("From ASPECT Before"); 
	  }  
	  
	  @After("p1()") // public
	  void dispcse1() { 
		  System.out.println("From ASPECT After"); 
		  }
	  
	   @AfterReturning(value="p1()",returning="obj") 
	   public void dispcse2(Object obj) { 
	   System.out.println("Returning value:"+obj); 
	   }
	  
	  @AfterThrowing(value="p1()",throwing="ex") 
	  public void dispcse3(Exception ex) { 
	 System.out.println("Exception raised"+ex.getMessage()); 
	 }

	  
   @Around("p1()")
   public void dispcse4(ProceedingJoinPoint pj) throws Throwable {
	   System.out.println("Executing before");
	  pj.proceed();
	   System.out.println("Executing after");
	 
   }
}