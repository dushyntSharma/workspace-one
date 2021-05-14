package codingChallenge;

//length()
//charAt()
//indexOf()
//compareTo()
//equals()

//Ask the user for no of fruits
//take the input of fruits
//create a method for validation 
//check the no for lowercase and not alpha numeric
//ask the user for searching String
//use the binary search for sorting
//return the op as yes or no

import java.util.Scanner;

public class FruitsNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of fruits");
		int n = sc.nextInt();
		String[] fruits = new String[n];
		System.out.println("Enter the fruits");
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = sc.next();
		}
		String[] fruits1 = insertionSort(fruits);
		for (int i = 0; i < fruits1.length; i++) {
			System.out.println(fruits1[i]);

		}
		System.out.println("Enter the fruit you need to search? ");
		String name = sc.next();

		int result = compareFruitsByBinarySearch(fruits1, name);
		if (result == -1)
			System.out.println("No");
		else
			System.out.println("Element found" + result);

	}

	public static String[] insertionSort(String[] fruits) {
		for (int i = 1; i < fruits.length; i++) {
			String key = fruits[i];
			int a = i - 1;
			while ((a > -1) && (fruits[a].compareTo(key)) > 0) {
				fruits[a + 1] = fruits[a];
				a--;
			}
			fruits[a + 1] = key;

		}
		System.out.println("Running");
		return fruits;

	}

	private static int compareFruitsByBinarySearch(String[] fruits, String name) {
		// TODO Auto-generated method stub
		int low = 0, high = fruits.length - 1;
		while (low <= high) {
			int mid = low + (high - 1) / 2;
			int result = name.compareTo(fruits[mid]);
			if (result == 0)
				return mid;
			if (result > 0)
				low = mid + 1;
			else
				high = mid - 1;

		}
		return -1;

	}

}
