package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="cseimage")
public class ImageData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String descp;
	@Column(length=65555)
	@Lob
	private byte[] image;
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
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public ImageData(int id, String name, String descp, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.descp = descp;
		this.image = image;
	}
	public byte[] getImage() {
		return image;
	}
	public ImageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

}
