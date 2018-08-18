package com.sun.onlineRetailers.category.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.onlineRetailers.bean.TreeBean;
import com.sun.onlineRetailers.category.domain.ProductCategory;
import com.sun.onlineRetailers.utils.DbUtils;
import com.sun.onlineRetailers.utils.TransUtils;

/**
 * 功能：
 * 说明：
 * @author 孙荆阁:
 * @Date 2018年8月13日 上午11:52:10
 */
@Service
public class PooductCategoryService {
	
	@Autowired
	DbUtils dbUtils;

	public List<TreeBean> list() throws Exception{
		List<TreeBean> list = new ArrayList<>();
		String sql = "SELECT id,pid pId,name from product_category where status = 1 ORDER BY pid,sort";
		List<Map<String,Object>> listMap = dbUtils.getList(sql);
		if (listMap != null) {
			list = TransUtils.listMapToList(listMap, TreeBean.class);
		}
		return list;
	}
}
