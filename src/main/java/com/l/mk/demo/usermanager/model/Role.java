package com.l.mk.demo.usermanager.model;

public class Role {
	
	private int id; //角色id
	private int type;//角色类型（access/menu/）
	private int value;//角色值
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
