package com.paletter.stdy.spring.jdbc.routingaop;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DataSource {

	String value();
}
