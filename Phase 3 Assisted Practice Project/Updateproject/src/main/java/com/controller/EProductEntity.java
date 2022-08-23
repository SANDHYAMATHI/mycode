package com.controller;

public class EProductEntity {
	
	private long id;
	private String name;
	private String email;
	
	
	public EProductEntity() {
	}

	public EProductEntity(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "EProductEntity [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}