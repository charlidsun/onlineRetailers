package com.sun.onlineRetailers.category.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.onlineRetailers.bean.TreeBean;
import com.sun.onlineRetailers.category.service.PooductCategoryService;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController{

	@Autowired
	PooductCategoryService productCategoryService;
	
	@GetMapping
	public List<TreeBean> getProductCategoryList() {
		List<TreeBean> list = new ArrayList<>();
		try {
			 list = productCategoryService.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
