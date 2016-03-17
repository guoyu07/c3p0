package com.base.dao.impl;

import java.util.List;

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
		
	};
}