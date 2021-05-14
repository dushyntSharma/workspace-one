package com.mindtree.services;

import java.util.List;

import com.mindtree.model.Item;
import com.mindtree.model.Shop;

public interface ShopManagement {
	public Shop sortPrice(List<Shop> shop, List<Item> item, String shopName);

	public List<Shop> availabilityOfItem(List<Shop> shop, List<Item> item, String itemName);

	public Item generateBill(List<Shop> shop, List<Item> item, String shopName, String itemName, int quantity);

}
