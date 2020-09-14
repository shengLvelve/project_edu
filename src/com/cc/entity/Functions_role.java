package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Functions_role {
	private int functions_role_id;
	//private int functions_role_role_id;
	private Role functions_role_role_id=new Role();
	//private int functions_role_functions_id;
	private Functions functions_role_functions_id = new Functions();
	public Functions_role() {
		super();
	}
	public Functions_role(int functions_role_id, int functions_role_role_id, int functions_role_functions_id) {
		super();
		this.functions_role_id = functions_role_id;
		this.functions_role_role_id.setRole_id(functions_role_role_id);
		this.functions_role_functions_id.setFunctions_id(functions_role_functions_id);
	}
	public int getFunctions_role_id() {
		return functions_role_id;
	}
	public void setFunctions_role_id(int functions_role_id) {
		this.functions_role_id = functions_role_id;
	}
	public int getFunctions_role_role_id() {
		return functions_role_role_id.getRole_id();
	}
	public void setFunctions_role_role_id(int functions_role_role_id) {
		this.functions_role_role_id.setRole_id(functions_role_role_id);;
	}
	public int getFunctions_role_functions_id() {
		return functions_role_functions_id.getFunctions_id();
	}
	public void setFunctions_role_functions_id(int functions_role_functions_id) {
		this.functions_role_functions_id.setFunctions_id(functions_role_functions_id);
	}
	@Override
	public String toString() {
		return "Functions_role [functions_role_id=" + functions_role_id + ", functions_role_role_id="
				+ functions_role_role_id + ", functions_role_functions_id=" + functions_role_functions_id + "]";
	}
	
}
