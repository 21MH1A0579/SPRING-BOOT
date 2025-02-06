package com.example.demo.Model;

public class CseModel {
	
	private int id;
	private String name;
	private String branch;
	private String college;
	private String city;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public CseModel(int id, String name, String branch, String college, String city) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.college = college;
		this.city = city;
	}
	

}
