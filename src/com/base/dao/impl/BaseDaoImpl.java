package com.base.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.base.dao.BaseDao;

@Service
public class BaseDaoImpl implements BaseDao{
	
	@Resource
	JdbcTemplate jdbcTemplate;
	public List getList(String sql){
		return this.jdbcTemplate.queryForList(sql);
		
	}
	public int[] batchUpdate(List<String> sqls) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<String> getListMap(List<String> sqls) {
		// TODO Auto-generated method stub
		return null;
	}
	public Map getMap(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	public int update(String sql) {
		// TODO Auto-generated method stub
		return 0;
	};
}
