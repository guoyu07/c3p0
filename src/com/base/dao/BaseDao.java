package com.base.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface BaseDao {

	List<?> getList(String sql);
	
	public int update(String sql);
	
	public int[] batchUpdate(List<String>sqls);
	
	public List<String> getListMap(List<String>sqls);
	
	public Map  getMap(String sql);
}
