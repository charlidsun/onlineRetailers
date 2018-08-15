package com.sun.onlineRetailers.option.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 功能： 说明：
 * 
 * @author 孙荆阁:
 * @Date 2018年8月6日 下午2:04:08
 */
@Data
public class ProductAttributeOption implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;// 选项名称
	private int attr_id;// 属性编码
	private int sort;// 排序
}
