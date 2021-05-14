package com.mindtree.services;

import com.mindtree.model.Product;

public class DisplayProduct {
	public static Product[] displayProducts(Product[] products, int length) {
		for (int i = 0; i < products.length; i++) {
			System.out.println();
			System.out.println("Product ID :" + products[i].getId());
			System.out.println("Product Name :" + products[i].getName());
			System.out.println("Product Quantity :" + products[i].getQty());
			System.out.println("Product Price :" + products[i].getPrice());
			System.out.println("--------------------------------");

		}
		return products;
	}

}
