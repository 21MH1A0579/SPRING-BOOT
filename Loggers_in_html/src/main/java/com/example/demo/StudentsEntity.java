package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="task1")
public class StudentsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="cseseq")
	@SequenceGenerator(name="cseseq",sequenceName="cseseq1",initialValue=501, allocationSize=1)
	@Column
	private int id;
	@Column
	private String name;
	public StudentsEntity(int id, String name, String branch, String city, int percent) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.city = city;
		this.percent = percent;
	}
	public StudentsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column
	private String branch;
	@Column
	private String city;
	@Column
	private int percent;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	
}
