package com.mindtree.model;

public class Student {
	private long id;
	private String name;
	private byte std;
	private byte age;
	private String address;

	public Student(long id, String name, byte std, byte age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public byte getStd() {
		return std;
	}

	public void setStd(byte std) {
		this.std = std;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
 }
