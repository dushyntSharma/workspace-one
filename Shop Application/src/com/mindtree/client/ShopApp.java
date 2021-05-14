package com.mindtree.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.model.Item;
import com.mindtree.model.Shop;
import com.mindtree.services.ShopManagement;
import com.mindtree.services.ShopManagementService;

public class ShopApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Item> item = new ArrayList<Item>();
		List<Shop> shop = new ArrayList<Shop>();
		ShopManagement shopManagementSreviceImple =  new ShopManagementService();
		int x = 0, y = 0;
		int choice;
		do {
			displayMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				enterItems(item, x);
				x++;
				break;
			case 2:
				enterShops(shop, item, y);
				y++;
				break;
			case 3:
				enterBill(shopManagementSreviceImple, shop, item);
				break;
			case 4:
				System.out.println("Enter shop name");
				String shopName = sc.nextLine();
				Shop items = shopManagementSreviceImple.sortPrice(shop, item, shopName);
				for (int i = 0; i < items.getItems().size(); i++)
					System.out.println(items.getItems().get(i).getName() + "," + items.getItems().get(i).getPrice()
							+ "," + items.getItems().get(i).getCount());
				break;
			case 5:
				System.out.println("Enter item name");
				String itemName = sc.nextLine();
				List<Shop> shops = shopManagementSreviceImple.availabilityOfItem(shop, item, itemName);
				for (int i = 0; i < shops.size(); i++)
					System.out.println(shops.get(i).getName());
				break;
			}
		} while (choice < 6);
	}

	public static void displayMenu() {
		System.out.println("*-------------------------------------*");
		System.out.println("1.Enter items");
		System.out.println("2.Enter shops");
		System.out.println("3.Generate bill");
		System.out.println("4.Items in a shop sorted by price");
		System.out.println("5.Availability of an item");
		System.out.println("*-------------------------------------*");
		System.out.println("Enter choice");
	}

	public static void enterItems(List<Item> item, int x) {
		System.out.println("Enter item name");
		String name = sc.nextLine();
		System.out.println("Enter item price");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter item count");
		int count = sc.nextInt();
		sc.nextLine();
		item.add(new Item(x + 1, name, price, count, true));
	}

	public static void enterShops(List<Shop> shop, List<Item> item, int y) {
		List<Item> itemList = new ArrayList<Item>();
		System.out.println("Enter shop name");
		String name = sc.nextLine();
		System.out.println("Enter shop location");
		String location = sc.nextLine();
		System.out.println("Enter no of items");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			boolean check = false;
			do {
				System.out.println("enter item name");
				String itemName = sc.nextLine();
				for (int j = 0; j < item.size(); j++) {
					if (item.get(j).getName().equals(itemName)) {
						itemList.add(item.get(j));
						check = true;
					}
				}
				if (!check)
					System.out.println("Item not found!! Enter again");
			} while (!check);
		}
		shop.add(new Shop(y + 1, name, location, itemList));
	}

	public static void enterBill(ShopManagement shopManagementSreviceImple, List<Shop> shop, List<Item> item) {
		System.out.println("Enter no of items");
		int n = sc.nextInt();
		sc.nextLine();
		int totalBill = 0;
		Item billItem;
		do {
			System.out.println("Enter shop name");
			String sname = sc.nextLine();
			System.out.println("Enter item name");
			String iname = sc.nextLine();
			System.out.println("Enter item quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			billItem = shopManagementSreviceImple.generateBill(shop, item, sname, iname, quantity);
			totalBill = totalBill + billItem.getPrice() * quantity;
			if (billItem.isCheckFlag()) {
				System.out.println("Shop name: " + sname);
				System.out.println("Item name: " + billItem.getName());
				System.out.println("Item total bill: " + billItem.getPrice() * quantity);
				n--;
			} else
				System.out.println(billItem.getName());
		} while (!billItem.isCheckFlag() || n > 0);
		System.out.println("Total Bill: " + totalBill);
	}

}
