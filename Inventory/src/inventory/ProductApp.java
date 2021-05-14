package inventory;
/*
 * 1)	Enter no of products
 * 		Add products
 * 		display
 * 2)   Quantity-int
 * 		compare with product ID
 * 		replace with the latest quantity
 * 3) 	take the quantity input from the user
 * 		if quantity of user is less than the original quantity 
 * 		then display all the those quantities
 * 4) 	bubble sort for quantity sort
 * 5) 	Delete the given product ID
 */

import java.util.Scanner;

public class ProductApp {
	static Scanner sc = new Scanner(System.in);
	static int noOfProducts;
	static Product[] allProducts;

	public static void main(String[] args) {
		System.out.println("Enter the no of products");
		noOfProducts = sc.nextInt();
		allProducts = new Product[noOfProducts];
		int choice = 0;

		do {
			displayMainMenu();
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addNewProduct(allProducts);
				displayProductDetails(allProducts);
				break;

			case 2:
				// Update the quantity of particular product

				System.out.println("Enter the product ID");
				long id = sc.nextLong();
				System.out.println("Enter the quantity");
				int quantity = sc.nextInt();
				updateQtForPartProduct(allProducts, id, quantity);
				displayProductDetails(allProducts);
				break;

			case 3:
				// Display products where quantity is less than provided by a user
				// user -> quantity
				// if products are less than that display
				System.out.println("Enter the Quantity you want?");
				int qty = sc.nextInt();
				displayLessQuantityProduct(allProducts, qty);
				break;

			case 4:
				// Display product sort on the basis of quantity
				displaySortByQuantity();
				break;

			case 5:
				// Delete a particular product from inventory
				System.out.println("Enter the ID to be deleted");
				int id1 = sc.nextInt();
				deleteParticularProduct(allProducts, id1);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (choice != 5);
	}

//	private static Product[] removeTheId(Product[] allProducts, int index) {
//		if (allProducts == null || index < 0 || index >= allProducts.length - 1) {
//			return allProducts;
//		}
//		Product[] anotherArray = new Product[allProducts.length - 1];
//		for (int i = 0, k = 0; i < anotherArray.length; i++) {
//			if (i == index) {
//				continue;
//			}
//			anotherArray[k++] = allProducts[i];
//
//		}
//		return anotherArray;
//	}

	private static void deleteParticularProduct(Product[] allProducts, int id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < allProducts.length; i++) {
			if (allProducts[i].getId() == id) {
				allProducts[i] = allProducts[allProducts.length - 1];
				break;
			}
			if (i == allProducts.length - 1) {
				System.out.println("That requested product is not there");
			}
		}

		for (int i = 0; i < allProducts.length - 1; i++) {
			System.out.println("Product Id       :" + allProducts[i].getId());
			System.out.println("Product Name     :" + allProducts[i].getName());
			System.out.println("Product Quantity :" + allProducts[i].getQuantity());
			System.out.println("Product Price    :" + allProducts[i].getPricePerUnit());
			System.out.println("================================================");

		}

	}

	private static void displaySortByQuantity() {
		Product[] allProducts2 = new Product[noOfProducts];
		allProducts2 = allProducts;
		Product[] temp = new Product[noOfProducts];
		for (int i = 0; i < noOfProducts - i; i++) {
			for (int j = i + 1; j < noOfProducts; j++) {
				if (allProducts2[i].getQuantity() > allProducts2[j].getQuantity()) {
					temp[i] = allProducts2[i];
					allProducts2[i] = new Product(allProducts2[j].getId(), allProducts2[j].getName(),
							allProducts2[j].getQuantity(), allProducts2[j].getPricePerUnit());
					allProducts2[j] = new Product(temp[i].getId(), temp[i].getName(), temp[i].getQuantity(),
							temp[i].getPricePerUnit());
				}

			}

		}
		for (int i = 0; i < noOfProducts; i++) {
			System.out.println(allProducts2[i].getId() + " " + allProducts2[i].getName() + " "
					+ allProducts2[i].getQuantity() + " " + allProducts2[i].getPricePerUnit());

		}

	}

	private static Product[] displaySortPrice(Product[] allProducts) {
		for (int i = 0; i < allProducts.length - i; i++) {
			for (int j = i + 1; j < allProducts.length; j++) {
				if (allProducts[i].getPricePerUnit() == allProducts[j].getPricePerUnit()) {
					if (allProducts[i].getQuantity() > allProducts[j].getQuantity()) {
						Product product = allProducts[i];
						allProducts[i] = allProducts[j];
						allProducts[j] = product;
					}
				} else {
					if (allProducts[i].getPricePerUnit() > allProducts[j].getPricePerUnit()) {
						Product p = allProducts[i];
						allProducts[i] = allProducts[j];
						allProducts[j] = p;
					}

				}

			}

		}
	}

	private static void displayLessQuantityProduct(Product[] allProducts, int qty) {
		for (int i = 0; i < allProducts.length; i++) {
			if (allProducts[i].getQuantity() <= qty) {
				System.out.println("Product Id       :" + allProducts[i].getId());
				System.out.println("Product Name     :" + allProducts[i].getName());
				System.out.println("Product Quantity :" + allProducts[i].getQuantity());
				System.out.println("Product Price    :" + allProducts[i].getPricePerUnit());
			}

		}

	}

	private static Product[] updateQtForPartProduct(Product[] allProducts, long id, int quantity) {
		for (int i = 0; i < allProducts.length; i++) {
			if (allProducts[i].getId() == id) {
				allProducts[i].setQuantity(quantity);
			}

		}
		return allProducts;

	}

	private static void displayProductDetails(Product[] allProducts) {
		for (int i = 0; i < allProducts.length; i++) {
			System.out.println("The products are -> ");
			System.out.println("Product Id       :" + allProducts[i].getId());
			System.out.println("Product Name     :" + allProducts[i].getName());
			System.out.println("Product Quantity :" + allProducts[i].getQuantity());
			System.out.println("Product Price    :" + allProducts[i].getPricePerUnit());
			System.out.println("===========================");

		}

	}

	private static Product[] addNewProduct(Product[] allProducts) {

		for (int i = 0; i < allProducts.length; i++) {
			System.out.println("Enter the id of the product");
			int id = sc.nextInt();
			System.out.println("Enter the name of the product");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the quantity");
			int quantity = sc.nextInt();
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			allProducts[i] = new Product(id, name, quantity, price);

		}
		return allProducts;

	}

	private static void displayMainMenu() {
		System.out.println("...........Main Menu......");
		System.out.println("1.Add products and display");
		System.out.println("2.update the quantity of a particular product");
		System.out.println("3.Display products where quantity is less than provided by a user");
		System.out.println("4.Display product sort on the basis of quantity");
		System.out.println("5.Delete a particular product from inventory");
		System.out.println("6.Exit");

	}

}
