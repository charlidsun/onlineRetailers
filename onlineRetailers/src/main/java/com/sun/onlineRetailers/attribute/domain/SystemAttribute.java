package com.sun.onlineRetailers.attribute.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 功能：商品类别
 * 说明：
 * @author 孙荆阁:
 * @Date 2018年8月6日 下午1:52:12
 */
@Data
public class SystemAttribute implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long category_id;//商品类别编号
	private String name;//属性名称属性名称
	private int sort;//排列次序
}
