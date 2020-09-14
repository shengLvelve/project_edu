package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Area {
	private int id;
	private int pid;
	private String name;
	private int level;
	private int area_code;
	
	public Area() {
		super();
	}

	public Area(int id, int pid, String name, int level, int area_code) {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.level = level;
		this.area_code = area_code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getArea_code() {
		return area_code;
	}

	public void setArea_code(int area_code) {
		this.area_code = area_code;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", pid=" + pid + ", name=" + name + ", level=" + level + ", area_code=" + area_code
				+ "]";
	}
	
	
}
