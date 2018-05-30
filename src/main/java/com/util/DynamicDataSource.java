package com.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 获取当前使用的数据源
 * 
 * @author Administrator
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource  {
	/**
	 * 取得当前使用那个数据源。
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DbContextHolder.getDbType();
	}

}
