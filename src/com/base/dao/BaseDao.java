package com.base.dao;

import java.util.List;
import java.util.Map;


public interface BaseDao {
	
	public void execute(String sql) throws Exception;

	public int update(String sql) throws Exception;
 
	public int[] batchUpdate(String... sql) throws Exception;
 
	public int[] batchUpdate(List<String> sqls);

	public Map<String, Object> queryForMap(String sql);
	
	public List<Map<String, Object>> queryForList(String sql) throws Exception;
	
	public int queryForCount(String sql) throws Exception;
	
//	public  String quertForValue(String sql,String key);

}
