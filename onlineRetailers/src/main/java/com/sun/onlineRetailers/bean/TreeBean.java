package com.sun.onlineRetailers.bean;

import lombok.Data;

@Data
public class TreeBean {

	private int id;
	private int pId;
	private String name;
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public int getpId() {
		return pId;
	}
}
