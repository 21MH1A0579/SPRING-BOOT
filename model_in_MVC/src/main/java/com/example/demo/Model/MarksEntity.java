package com.example.demo.Model;

public class MarksEntity {

	private int id;
	private String name;
	private String branch;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public MarksEntity(int id, String name, String branch, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}
	
	
}
