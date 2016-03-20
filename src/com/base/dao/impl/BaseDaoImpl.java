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
		return this.batchUpdate(sql);
	}

	public int[] batchUpdate(List<String> sqls) {

		return this.batchUpdate(sqls);
	}

	public void execute(String sql) throws DataAccessException {

		this.execute(sql);

	}

	public String quertForValue(String sql, String key) {

		return this.quertForValue(sql, key);
	}

	public int queryForCount(String sql) throws DataAccessException {

		return this.queryForCount(sql);
	}

	public List<Map<String, Object>> queryForList(String sql)
			throws DataAccessException {

		return this.queryForList(sql);
	}

	public Map<String, Object> queryForMap(String sql) {

		return this.queryForMap(sql);
	}

	public int update(String sql) throws DataAccessException {

		return this.update(sql);
	}

}
