package com.cc.entity;

import org.springframework.stereotype.Component;

@Component
public class Letter_status {
	private int letter_status_id;
	private String letter_status_value;
	public Letter_status() {
		super();
	}
	public Letter_status(int letter_status_id, String letter_status_value) {
		super();
		this.letter_status_id = letter_status_id;
		this.letter_status_value = letter_status_value;
	}
	public int getLetter_status_id() {
		return letter_status_id;
	}
	public void setLetter_status_id(int letter_status_id) {
		this.letter_status_id = letter_status_id;
	}
	public String getLetter_status_value() {
		return letter_status_value;
	}
	public void setLetter_status_value(String letter_status_value) {
		this.letter_status_value = letter_status_value;
	}
	@Override
	public String toString() {
		return "Letter_status [letter_status_id=" + letter_status_id + ", letter_status_value=" + letter_status_value
				+ "]";
	}
	
}
