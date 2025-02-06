package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="faculity")
public class FaculityEntity {
	@SuppressWarnings("deprecation")
	@Id
	@Column
	@GeneratedValue(generator = "cseid")
	@GenericGenerator(name = "cseid",type=SequenceGenerator.class)
	private String empid; 
	@Column
	private String name;
	@Column
	private String branch;
	@Column
	private int salary;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
