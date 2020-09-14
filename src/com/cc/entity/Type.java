package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Type {
	private int type_id;
	private String type_value;
	public Type() {
		super();
	}
	public Type(int type_id, String type_value) {
		super();
		this.type_id = type_id;
		this.type_value = type_value;
	
	}
	@Override
	public String toString() {
		return "Type [type_id=" + type_id + ", type_value=" + type_value + "]";
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_value() {
		return type_value;
	}
	public void setType_value(String type_value) {
		this.type_value = type_value;
	}

	
	
	
}
