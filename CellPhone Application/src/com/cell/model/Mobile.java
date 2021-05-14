package com.cell.model;

import java.util.HashSet;

public class Mobile {
	private long id;
	private String name;
	private double price;
	private HashSet<Customer> customer;

	public Mobile(long id, String name, double price, HashSet<Customer> customer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.customer = customer;
	}

	public Mobile() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public HashSet<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(HashSet<Customer> customer) {
		this.customer = customer;
	}

}
