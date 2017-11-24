package com.paletter.stdy.spring.jdbc.routingaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

	@Around("execution(* com.paletter.stdy.spring.jdbc.routingaop.*DaoImpl.*(..)) && @annotation(dataSource)")
	public Object around(ProceedingJoinPoint jp, DataSource dataSource) throws Throwable {
		
		System.out.println("==================Around");
		System.out.println(dataSource.value());
		
		RoutingDataSource.setTargetDataSource(dataSource.value());
		
		Object rtn = jp.proceed(jp.getArgs());
		return rtn;
	}
	
}
