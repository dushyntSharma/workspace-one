package com.mindtree.model;

import java.util.List;

public class Shop {
	private int id;
	private String name;
	private String location;
	private List<Item> items;

	public Shop() {
		super();
	}

	public Shop(int id, String name, String location, List<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.items = items;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
