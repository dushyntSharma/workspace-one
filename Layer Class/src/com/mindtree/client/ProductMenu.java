package com.mindtree.client;

import java.util.Scanner;

import com.mindtree.services.AddProduct;
import com.mindtree.services.DisplayProduct;
import com.mindtree.services.SortProduct;
import com.mindtree.model.Product;

public class ProductMenu {
	static Scanner sc = new Scanner(System.in);
	static Product[] products = new Product[0];
	static int len = products.length;

	public static void main(String[] args) {

		int choice;
		do {
			displayMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				products = AddProduct.addNewProduct(products, len);
				len = products.length;
				break;

			case 2:
				products = DisplayProduct.displayProducts(products, len);
				break;
				
			case 3: 
				SortProduct.sortProducts(products);
				break;
			}
		} while (choice < 3);
	}

	private static void displayMenu() {
		System.out.println();
		System.out.println("1.Add products to the database :");
		System.out.println("2.Display products");
		System.out.println("3.Sort the products");

	}

}
