package com.base.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface BaseDao {
	
	/**
	 * Issue a single SQL execute, typically a DDL statement.
	 * @param sql static SQL to execute
	 * @throws DataAccessException if there is any problem
	 */
	public void execute(String sql) throws DataAccessException;

	/**
	 * Issue a single SQL update operation (such as an insert, update or delete statement).
	 * @param sql static SQL to execute
	 * @return the number of rows affected
	 * @throws DataAccessException if there is any problem.
	 */
	public int update(String sql) throws DataAccessException;
	/**
	 * Execute a batch using the supplied SQL statement with the batch of supplied arguments.
	 * @param sql the SQL statement to execute
	 * @param batchArgs the List of Object arrays containing the batch of arguments for the query
	 * @return an array containing the numbers of rows affected by each update in the batch
	 */
	public int[] batchUpdate(String... sql) throws DataAccessException;
	/**
	 * Execute a batch using the supplied SQL statement with the batch of supplied arguments.
	 * @param sql the SQL statement to execute
	 * @param batchArgs the List of Object arrays containing the batch of arguments for the query
	 * @return an array containing the numbers of rows affected by each update in the batch
	 */
	public int[] batchUpdate(List<String> sqls);

	public Map<String, Object> queryForMap(String sql);
	
	public List<Map<String, Object>> queryForList(String sql) throws DataAccessException;
	
	public int queryForCount(String sql) throws DataAccessException;
	
	public  String quertForValue(String sql,String key);

}
