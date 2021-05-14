
import java.util.Scanner;

/*
	create medicines
	create customer
	add medicines to customer
	Display bill of the particular customer by printing customer detail and total price he need to pay
		ask user for customer ID
		search for the customer
		get medicine detail for the customer
		get sum of all medicine costs
	If the customer has senior citizen card decrease the MRP of each medicine by 5%(update)
		find the age of the customer and check if the they are more than 60 years
		for those customers decrease the medicine prices by 5%
	sort customer basis on the age
	Delete particular medicine for a particular customer
		enter the customer ID
		enter medicine name
		*/
public class MedicineApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// create medicines
		Medicine[] medicines = getCreatedMedicines();
		// create Customer
		Customer[] customers = getCreatedCustomers();
		// get customer ID and add medicines to that customer
		System.out.println("Enter a customer ID to buy medicines");
		long customerId = sc.nextLong();
		Customer customer = getCustomerWithMedicines(customers, customerId);
		// display all medicines
		displayMedicines(medicines);

		// create some medicines
		Medicine[] choosenMedicine = getMedicinesForParticularCustomer(customer, medicines);
		customer.setMedicines(choosenMedicine);

		displayCustomer(customer);

	}

	private static Medicine[] getMedicinesForParticularCustomer(Customer customer, Medicine[] medicines) {
		System.out.println("Enter no of medicines for " + customer.getId());
		int medicineCount = sc.nextInt();
		Medicine[] particularMedicines = new Medicine[medicineCount];
		int index = 0;
		for (int i = 0; i < particularMedicines.length; i++) {
			System.out.println("enter Medicine name");
			String medicineName = sc.nextLine();
			for (int j = 0; j < medicines.length; j++) {
				if (medicineName.equals(medicines[j].getName())) {
					particularMedicines[index] = medicines[j];
					index++;
				}

			}

		}

		return null;
	}

	private static void displayCustomer(Customer customer) {
		System.out.println("id :" + customer.getId());
		System.out.println("name :" + customer.getName());
		System.out.println("age :" + customer.getAge());
		for (int i = 0; i < customer.getMedicines().length; i++) {
			System.out.println("id : " + customer.getId());

		}

	}

	private static Customer getCustomerWithMedicines(Customer[] customers, long customerId) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getId() == customerId) {
				// customer -> a particular customer is found
				// get that customer

				// display all medicines
				// create some medicines
				// add it to the customers

//				
//				System.out.println("Choose medicines from all medicines :");
//				displayMedicines(medicines);
//				System.out.println("Choose medicine to add to the cutomer :");
//				String medicineName = sc.nextLine();
//				Medicine[] particularCustomerMedicines = customers[i].getMedicines();
//				for (int j = 0; j < medicines.length; j++) {
//					if(medicines[j].getName().equals(medicineName)) {
//						particularCustomerMedicines[]
//					}
//					
//				}
			}

		}
		return null;
	}

	private static void displayMedicines(Medicine[] medicines) {
		for (int i = 0; i < medicines.length; i++) {
			System.out.println("=====================");
			System.out.println("Medicine name :" + medicines[i].getName());
			System.out.println("Medicine quantity :" + medicines[i].getQuantity());
			System.out.println("Medicine price per unit :" + medicines[i].getPricePerUnit());

		}

	}

	private static Customer[] getCreatedCustomers() {
		System.out.println("Enter total no of customer");
		int count = sc.nextInt();
		Customer[] allCustomers = new Customer[count];
		for (int i = 0; i < allCustomers.length; i++) {
			System.out.println("Enter the Id of the customer");
			long id = sc.nextLong();
			System.out.println("Enter the name of the customer");
			String name = sc.nextLine();
			System.out.println("Enter the age of the customer");
			byte age = sc.nextByte();

			allCustomers[i] = new Customer(id, name, age);

		}
		return allCustomers;
	}

	private static Medicine[] getCreatedMedicines() {
		// ask user for total no of medicines
		System.out.println("Enter the total no of medicines");
		int count = sc.nextInt();
		Medicine[] allMedicines = new Medicine[count];
		// create medicines
		for (int i = 0; i < allMedicines.length; i++) {
			System.out.println("Enter the med name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the quantity of med");
			int quantity = sc.nextInt();
			System.out.println("Enter the price of the med");
			double pricePerUnit = sc.nextDouble();

			allMedicines[i] = new Medicine(name, quantity, pricePerUnit);

		}

		// return medicines

		return allMedicines;
	}

}
