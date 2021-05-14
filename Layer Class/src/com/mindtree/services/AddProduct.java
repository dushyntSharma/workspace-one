package com.mindtree.services;

import java.util.Scanner;

import com.mindtree.model.Product;

public class AddProduct {
	static Scanner sc = new Scanner(System.in);

	public static Product[] addNewProduct(Product[] products, int length) {
		products = resizeProduct(products);
		length = products.length;
		System.out.println("Add " + length + "th product");
		int len = length;

		System.out.println("Enter the ID of the product :");
		long id = sc.nextLong();
		System.out.println("Enter the name of the product :");
		String name = sc.next();
		System.out.println("Enter the Quantity :");
		int qty = sc.nextInt();
		System.out.println("Enter the Price of the product :");
		double price = sc.nextDouble();

		Product product = new Product(id, name, qty, price);
		products[length - 1] = product;
		System.out.println(length + "th product added successfully");
		return products;

	}

	private static Product[] resizeProduct(Product[] products) {
		// TODO Auto-generated method stub
		Product[] anotherTempProduct = new Product[products.length + 1];
		if (anotherTempProduct.length == 1)
			return anotherTempProduct;
		else {
			for (int i = 0; i < products.length; i++) {
				anotherTempProduct[i] = products[i];

			}
		}
		return anotherTempProduct;
	}

}
