package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Role {
	private int role_id;
	private int role_name;
	public Role() {
		super();
	}
	public Role(int role_id, int role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getRole_name() {
		return role_name;
	}
	public void setRole_name(int role_name) {
		this.role_name = role_name;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + "]";
	}
	
}
