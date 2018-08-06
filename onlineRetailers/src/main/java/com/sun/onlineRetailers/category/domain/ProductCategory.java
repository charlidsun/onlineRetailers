 package com.sun.onlineRetailers.category.domain;
/**
 * 功能：分类
 * 说明：
 * @author 孙荆阁:
 * @Date 2018年8月6日 下午1:55:51
 */
public class ProductCategory {
	
	 private Long id;
	 private String name;//分类表
	 private int pid;//父分类编号
	 private String cover;//封面图
	 private int index_block_status;//首页块级状态 1=>显示
	 private int status;//状态 1=>正常
	 private int sort;//排序
	 private String created_at;
	 private String updated_at;
	 
}
