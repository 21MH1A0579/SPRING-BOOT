package com.example.demo;

public class StudentDTO {
    private String name;
    private String branch;
    private String mobile;

    public StudentDTO(String name, String branch, String mobile) {
        this.name = name;
        this.branch = branch;
        this.mobile = mobile;
    }

    // Getters and setters
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
