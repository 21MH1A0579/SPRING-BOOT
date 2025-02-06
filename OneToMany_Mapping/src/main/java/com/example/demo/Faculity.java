package com.example.demo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="csefaculty")
public class Faculity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seqgen")
	@SequenceGenerator(name="seqgen",sequenceName="seqgen1",initialValue=1001,allocationSize=1)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String branch;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="facultyid")
	Set<Subjects> subjects;

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

	public Set<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}
}
