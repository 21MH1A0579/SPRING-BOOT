package com.example.demo;

public class MyTableDTO {
          
	    private int id;
	    private String branch;
	    private String name;
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
		public MyTableDTO(int id, String branch, String name) {
			super();
			this.id = id;
			this.branch = branch;
			this.name = name;
		}
		public MyTableDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
