package String;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {

		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int numberOne = sc.nextInt();
		System.out.println("Enter second number");
		int numberTwo = sc.nextInt();

		System.out.println("Before Swaping");
		System.out.println("FirstNumber:" + numberOne);
		System.out.println("SecondNumber:" + numberTwo);
		System.out.println("--------------------------------");
		swap(numberOne, numberTwo);

	}

	private static void swap(int numberOne, int numberTwo) {

//		int temp = 0;
//		temp = numberOne;
//		numberOne = numberTwo;
//		numberTwo = temp;

		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;

		System.out.println("After Swaping");
		System.out.println("FirstNumber:" + numberOne);
		System.out.println("SecondNumber:" + numberTwo);
	}

}