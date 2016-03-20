package com.base.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.base.dao.BaseDao;

@Service
public class BaseDaoImpl implements BaseDao {

	@Resource
	JdbcTemplate jdbcTemplate;

	public int[] batchUpdate(String... sql) throws DataAccessException {
		return this.jdbcTemplate.batchUpdate(sql);
	}

	public int[] batchUpdate(List<String> sqls) {
		String []obj=null;
		int length=0;
		if (sqls!=null) {
			length=sqls.size();
			obj=new String[length];
		};
		for (int i = 0; i < length; i++) {
			obj[i]=sqls.get(i);
		}
		return this.jdbcTemplate.batchUpdate(obj);
	}

	public void execute(String sql) throws DataAccessException {

		this.jdbcTemplate.execute(sql);

	}

//	public String queryForValue(String sql) {
//
//		this.jdbcTemplate.queryforob
//		return this.jdbcTemplate.queryForObject(sql, Integer.class);
//	}
//	
//	public String queryForValue(String sql, String key) {
//
//		return this.jdbcTemplate.queryForObject(sql, Integer.class);
//	}

	public int queryForCount(String sql) throws DataAccessException {
		int count=this.jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	public List<Map<String, Object>> queryForList(String sql)
			throws DataAccessException {
		return this.jdbcTemplate.queryForList(sql);
	}

	public Map<String, Object> queryForMap(String sql) {

		return this.jdbcTemplate.queryForMap(sql);
	}

	public int update(String sql) throws DataAccessException {

		return this.jdbcTemplate.update(sql);
	}

}
