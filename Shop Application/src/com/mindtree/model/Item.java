package com.mindtree.model;

public class Item implements Comparable<Item> {

	private int id;
	private String name;
	private int price;
	private int count;
	private boolean checkFlag;

	public Item() {
		super();
	}

	public Item(int id, String name, int price, int count, boolean checkFlag) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
		this.checkFlag = checkFlag;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(boolean checkFlag) {
		this.checkFlag = checkFlag;
	}

	@Override
	public int compareTo(Item i) {
		if (this.price == i.price)
			return i.count - this.count;
		else
			return this.price - i.price;
	}

}
