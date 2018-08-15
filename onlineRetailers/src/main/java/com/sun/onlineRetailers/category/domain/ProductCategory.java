package com.sun.onlineRetailers.category.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 功能：分类 说明：
 * 
 * @author 孙荆阁:
 * @Date 2018年8月6日 下午1:55:51
 */
@Data
public class ProductCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;// 分类表
	private int pId;// 父分类编号
	private String cover;// 封面图
	private int index_block_status;// 首页块级状态 1=>显示
	private int status;// 状态 1=>正常
	private int sort;// 排序
	private String created_at;
	private String updated_at;

}
