package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdata")
public class UserData {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column
    	private int id;
	    @Column
    	private String name;
	    @Column
    	private String branch;
	    @Column
    	private int marks;
		public UserData() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserData(int id, String name, String branch, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.branch = branch;
			this.marks = marks;
		}
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
}
