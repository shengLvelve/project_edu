package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Functions {
	private int functions_id;
	private int functions_pid;
	private String functions_name;
	private String functions_path;
	public Functions() {
		super();
	}
	public Functions(int functions_id, int functions_pid, String functions_name, String functions_path) {
		super();
		this.functions_id = functions_id;
		this.functions_pid = functions_pid;
		this.functions_name = functions_name;
		this.functions_path = functions_path;
	}
	public int getFunctions_id() {
		return functions_id;
	}
	public void setFunctions_id(int functions_id) {
		this.functions_id = functions_id;
	}
	public int getFunctions_pid() {
		return functions_pid;
	}
	public void setFunctions_pid(int functions_pid) {
		this.functions_pid = functions_pid;
	}
	public String getFunctions_name() {
		return functions_name;
	}
	public void setFunctions_name(String functions_name) {
		this.functions_name = functions_name;
	}
	public String getFunctions_path() {
		return functions_path;
	}
	public void setFunctions_path(String functions_path) {
		this.functions_path = functions_path;
	}
	@Override
	public String toString() {
		return "Functions [functions_id=" + functions_id + ", functions_pid=" + functions_pid + ", functions_name="
				+ functions_name + ", functions_path=" + functions_path + "]";
	}
	
	
}
