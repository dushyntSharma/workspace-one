package mobile;

//Add mobiles
//display
//sort the mobiles using bubble sort
//display them
//take the mobile id from the user
//update the price using setters
//display them after
//delete particular mobile id

import java.util.Scanner;

public class MobileApp {
	static Scanner sc = new Scanner(System.in);
	static Mobile[] allMobiles;

	public static void main(String[] args) {
		boolean flag = true;
		int choice = 0;
		do {
			displayMainMenu();
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Mobile[] mob = addNewMobile(allMobiles);
				displayProductDetails(mob);
				allMobiles = mob;
				break;

			case 2:
				Mobile[] m = sortMobileByModel(allMobiles);
				System.out.println("After sorting based on the Model\n");
				displayProductDetails(m);
				break;
			case 3:
				Mobile[] upd = updateQtForPartProduct(allMobiles);
				System.out.println("After Upating the price :\n");
				displayProductDetails(upd);
				allMobiles = upd;
				break;
			case 4:
				deleteParticularProduct();
				break;
			case 5:
				System.out.println("Visit again, Thank you!!");
				flag = false;
				break;

			default:
				System.out.println("Invalid choice");
				System.out.println("Try again");

			}

		} while (flag);

	}

	public static Mobile[] removeTheElement(Mobile[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		// take another array
		Mobile[] anotherArray = new Mobile[arr.length - 1];
		// loop through the original array
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			// print
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}

	private static void deleteParticularProduct() {
		System.out.println("Enter the mobile id");
		long id = sc.nextLong();

		for (int i = 0; i < allMobiles.length; i++) {
			if (id == allMobiles[i].getId()) {
				allMobiles = removeTheElement(allMobiles, i);
			}
		}
		displayProductDetails(allMobiles);

	}

	private static Mobile[] updateQtForPartProduct(Mobile[] allMobiles) {
		// TODO Auto-generated method stub
		System.out.println("Enter the ID");
		long id = sc.nextLong();
		for (int i = 0; i < allMobiles.length; i++) {
			if (allMobiles[i].getId() == id) {
				System.out.println("Enter the Price");
				double price = sc.nextDouble();
				allMobiles[i].setPrice(price);
			}

		}
		return allMobiles;

	}

	private static Mobile[] sortMobileByModel(Mobile[] allMobiles) {
		// TODO Auto-generated method stub
		for (int i = 0; i < allMobiles.length - i; i++) {
			for (int j = i + 1; j < allMobiles.length; j++) {
				if (allMobiles[i].getModel().compareTo(allMobiles[j].getModel()) > 0)// if(a>b)
				{
					Mobile mob = allMobiles[i];// temp=a;
					allMobiles[i] = allMobiles[j];// a=b;
					allMobiles[j] = mob;// b=temp;

				}
			}
		}

		return allMobiles;

	}

	private static void displayProductDetails(Mobile[] allMobiles) {
		// TODO Auto-generated method stub
		for (int i = 0; i < allMobiles.length; i++) {
			System.out.println("The Mobiles are -> ");
			System.out.println("Mobile Id       :" + allMobiles[i].getId());
			System.out.println("Mobile Model    :" + allMobiles[i].getModel());
			System.out.println("Mobile Price    :" + allMobiles[i].getPrice());
			System.out.println("Mobile Date     :" + allMobiles[i].getDate());
			System.out.println("===========================");
		}

	}

	private static Mobile[] addNewMobile(Mobile[] allMobiles) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of mobiles you need to add");
		int n = sc.nextInt();
		allMobiles = new Mobile[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the id");
			long id = sc.nextLong();
			System.out.println("Enter the model");
			sc.nextLine();
			String model = sc.nextLine();
			System.out.println("Enter the price");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the date");
			String date = sc.nextLine();
			Mobile mob = new Mobile(id, model, price, date);
			allMobiles[i] = mob;

		}
		return allMobiles;

	}

	private static void displayMainMenu() {
		// TODO Auto-generated method stub
		System.out.println("...........Main Menu......");
		System.out.println("1.Add Mobiles to the System");
		System.out.println("2.Sort Mobiles based on Model");
		System.out.println("3.Update Price of Mobile");
		System.out.println("4.Delete Mobile from the System");
		System.out.println("5.Exit");

	}

}
