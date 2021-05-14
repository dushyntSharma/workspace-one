package com.mindtree.services;

import java.util.Scanner;

import com.mindtree.model.Product;

public class SortProduct {
	static Scanner sc = new Scanner(System.in);

	public static void sortProducts(Product[] products) {
		int choice;
		do {
			menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sortByID(products);
				break;
			case 2:
				sortByName(products);
				break;
			case 3:
				sortByQuantity(products);
				break;
			case 4:
				sortByPrice(products);
				break;

			}
		} while (choice < 5);

	}

	private static void sortByName(Product[] products) {
		// TODO Auto-generated method stub
		int n = products.length;
		Product[] temp = new Product[n];
		for (int i = 0; i < n - i; i++) {
			for (int j = i + 1; j < n; j++) {
				if (products[i].getName().compareTo(products[j].getName()) > 0) {
					temp[i] = products[i];
					products[i] = new Product(products[j].getId(), products[j].getName(), products[j].getQty(),
							products[j].getPrice());
					products[j] = new Product(temp[i].getId(), temp[i].getName(), temp[i].getQty(), temp[i].getPrice());
				}

			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Product Id       :" + products[i].getId());
			System.out.println("Product Name     :" + products[i].getName());
			System.out.println("Product Quantity :" + products[i].getQty());
			System.out.println("Product Price    :" + products[i].getPrice());

		}

	}

	private static void sortByPrice(Product[] products) {
		// TODO Auto-generated method stub
		int n = products.length;
		Product[] temp = new Product[n];
		for (int i = 0; i < n - i; i++) {
			for (int j = i + 1; j < n; j++) {
				if (products[i].getPrice() > products[j].getPrice()) {
					temp[i] = products[i];
					products[i] = new Product(products[j].getId(), products[j].getName(), products[j].getQty(),
							products[j].getPrice());
					products[j] = new Product(temp[i].getId(), temp[i].getName(), temp[i].getQty(), temp[i].getPrice());
				}

			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Product Id       :" + products[i].getId());
			System.out.println("Product Name     :" + products[i].getName());
			System.out.println("Product Quantity :" + products[i].getQty());
			System.out.println("Product Price    :" + products[i].getPrice());

		}

	}

	private static void sortByQuantity(Product[] products) {
		// TODO Auto-generated method stub
		int n = products.length;
		Product[] temp = new Product[n];
		for (int i = 0; i < n - i; i++) {
			for (int j = i + 1; j < n; j++) {
				if (products[i].getQty() > products[j].getQty()) {
					temp[i] = products[i];
					products[i] = new Product(products[j].getId(), products[j].getName(), products[j].getQty(),
							products[j].getPrice());
					products[j] = new Product(temp[i].getId(), temp[i].getName(), temp[i].getQty(), temp[i].getPrice());
				}

			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Product Id       :" + products[i].getId());
			System.out.println("Product Name     :" + products[i].getName());
			System.out.println("Product Quantity :" + products[i].getQty());
			System.out.println("Product Price    :" + products[i].getPrice());

		}

	}

	private static void sortByID(Product[] products) {
		// TODO Auto-generated method stub
		int n = products.length;
		Product[] temp = new Product[n];
		for (int i = 0; i < n - i; i++) {
			for (int j = i + 1; j < n; j++) {
				if (products[i].getId() > products[j].getId()) {
					temp[i] = products[i];
					products[i] = new Product(products[j].getId(), products[j].getName(), products[j].getQty(),
							products[j].getPrice());
					products[j] = new Product(temp[i].getId(), temp[i].getName(), temp[i].getQty(), temp[i].getPrice());
				}

			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Product Id       :" + products[i].getId());
			System.out.println("Product Name     :" + products[i].getName());
			System.out.println("Product Quantity :" + products[i].getQty());
			System.out.println("Product Price    :" + products[i].getPrice());

		}

	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("1.Sort By ID :");
		System.out.println("2.Sort By Name :");
		System.out.println("3.Sort By Quantity :");
		System.out.println("4.Sort By Price :");

	}

}
