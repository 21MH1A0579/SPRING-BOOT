package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="studentTrans")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="cseseq")
	@SequenceGenerator(name="cseseq",sequenceName="cseseq1",initialValue=501,allocationSize=1)
	@Column
	private int id;
	
	@Column
	private String branch;
	@Column
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressid")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
