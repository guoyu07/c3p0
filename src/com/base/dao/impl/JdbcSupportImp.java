package com.base.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

import com.base.dao.JdbcSupport;

@Service
public class JdbcSupportImp implements JdbcSupport {

	/**
	 * 数据源
	 */
	@Resource
	DataSource dataSource;
	
	/**
	 *　重载方法：getConnection
	 * (non-Javadoc)
	 * @throws SQLException 
	 * @see com.netsky.base.baseDao.JdbcSupport#getConnection()
	 */
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}


	/**
	 *　重载方法：getTransManager
	 * (non-Javadoc)
	 * @see com.netsky.base.baseDao.JdbcSupport#getTransManager()
	 */
	public PlatformTransactionManager getTransManager() {
		return new DataSourceTransactionManager(dataSource);
	}

}
