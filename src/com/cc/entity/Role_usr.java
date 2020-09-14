package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Role_usr {
	private int role_usr_id;
	private int role_usr_usr_id;
	//private int role_usr_type;
	private Type role_usr_type;
	//private int role_id;
	private Role role_id;
	public Role_usr() {
		super();
	}
	public Role_usr(int role_usr_id, int role_usr_usr_id, int role_usr_type, int role_id) {
		super();
		this.role_usr_id = role_usr_id;
		this.role_usr_usr_id = role_usr_usr_id;
		this.role_usr_type.setType_id(role_usr_type);
		this.role_id.setRole_id(role_id);
	}
	public int getRole_usr_id() {
		return role_usr_id;
	}
	public void setRole_usr_id(int role_usr_id) {
		this.role_usr_id = role_usr_id;
	}
	public int getRole_usr_usr_id() {
		return role_usr_usr_id;
	}
	public void setRole_usr_usr_id(int role_usr_usr_id) {
		this.role_usr_usr_id = role_usr_usr_id;
	}
	public int getRole_usr_type() {
		return role_usr_type.getType_id();
	}
	public void setRole_usr_type(int role_usr_type) {
		this.role_usr_type.setType_id(role_usr_type);
	}
	public int getRole_id() {
		return role_id.getRole_id();
	}
	public void setRole_id(int role_id) {
		this.role_id.setRole_id(role_id);
	}
	@Override
	public String toString() {
		return "Role_usr [role_usr_id=" + role_usr_id + ", role_usr_usr_id=" + role_usr_usr_id + ", role_usr_type="
				+ role_usr_type + ", role_id=" + role_id + "]";
	}
	
}
