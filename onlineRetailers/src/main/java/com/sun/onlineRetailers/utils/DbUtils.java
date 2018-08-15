package com.sun.onlineRetailers.utils;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 功能：
 * 说明：
 * @author 孙荆阁:
 * @Date 2018年8月13日 上午11:54:04
 */
@Repository
public class DbUtils {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Map<String,Object>> getList(String sql){
		return jdbcTemplate.queryForList(sql);
	}
	
	public Map<String,Object> getTb(String sql){
		return jdbcTemplate.queryForMap(sql);
	}
}
