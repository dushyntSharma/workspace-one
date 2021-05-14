package com.mindtree.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mindtree.model.Item;
import com.mindtree.model.Shop;
import com.mindtree.services.ShopManagement;

public class ShopManagementService implements ShopManagement {
	public Shop sortPrice(List<Shop> shop, List<Item> item, String shopName) {
		// TODO Auto-generated method stub
		Shop s = new Shop();
		for (int i = 0; i < shop.size(); i++) {
			if (shop.get(i).getName().equals(shopName)) {
				Collections.sort(shop.get(i).getItems());
				s = shop.get(i);
			}
		}
		return s;
	}

	public List<Shop> availabilityOfItem(List<Shop> shop, List<Item> item, String itemName) {
		List<Shop> shops = new ArrayList<Shop>();
		boolean check = false;
		// TODO Auto-generated method stub
		for (int i = 0; i < shop.size(); i++) {
			for (int j = 0; j < shop.get(i).getItems().size(); j++) {
				if (shop.get(i).getItems().get(j).getName().equals(itemName)) {
					check = true;
					shops.add(shop.get(i));
				}
			}
		}
		return shops;
	}

	public Item generateBill(List<Shop> shop, List<Item> item, String shopName, String itemName, int quantity) {
		Item billItem = new Item();
		boolean checkShop = false, checkItem = false;
		for (int i = 0; i < shop.size(); i++) {
			if (shop.get(i).getName().equals(shopName)) {
				checkShop = true;
				for (int j = 0; j < shop.get(i).getItems().size(); j++) {
					if (shop.get(i).getItems().get(j).getName().equals(itemName)) {
						checkItem = true;
						if (shop.get(i).getItems().get(j).getCount() > quantity) {
							int count = shop.get(i).getItems().get(j).getCount() - quantity;
							shop.get(i).getItems().get(j).setCount(count);
							billItem = shop.get(i).getItems().get(j);
							billItem.setCheckFlag(true);
							return billItem;
						} else {
							billItem.setCheckFlag(false);
							billItem.setName("Quatity not enough");
						}
					}
				}
				if (!checkItem) {
					billItem.setCheckFlag(false);
					billItem.setName("Item not found");
				}
			}
		}
		if (!checkShop) {
			billItem.setCheckFlag(false);
			billItem.setName("Shop not found");
		}
		return billItem;
	}

}
