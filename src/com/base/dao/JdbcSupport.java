package com.base.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.transaction.PlatformTransactionManager;

/**
 * @description:
 * 基于JDBC基础资源
 * @class name:com.netsky.base.baseDao.JdbcSupport
 * @author wind Feb 25, 2010
 */
public interface JdbcSupport {
	/**
	 * 或得数据连接
	 * @return Connection
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException;
	
	
	/**
	 * 获得数据事务管理类
	 * @return DataSourceTransactionManager
	 */
	public PlatformTransactionManager getTransManager();
	
}
