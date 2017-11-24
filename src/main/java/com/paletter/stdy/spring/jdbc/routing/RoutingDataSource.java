package com.paletter.stdy.spring.jdbc.routing;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.util.StringUtils;

public class RoutingDataSource extends AbstractRoutingDataSource {

	private static final ThreadLocal<String> TARGET_DATA_SOURCE = new ThreadLocal<String>();
	
	@Override
	protected Object determineCurrentLookupKey() {
		String targetDataSource = TARGET_DATA_SOURCE.get();
		if(StringUtils.isEmpty(targetDataSource)) {
			targetDataSource = "dataSource1";
			TARGET_DATA_SOURCE.set(targetDataSource);
		}
		System.out.println("=======================DataSource:" + targetDataSource);
		return targetDataSource;
	}

	public static void setTargetDataSource(String name) {
		TARGET_DATA_SOURCE.set(name);
	}
}
