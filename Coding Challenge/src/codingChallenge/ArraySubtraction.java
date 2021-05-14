package codingChallenge;

import java.util.Scanner;

//Allowed methods
//    ~~~~~~~~~~~~~~~~
//    length()
//    charAt()
//    indexOf()
//    compareTo()
//    equals()
//

//2 arrays for the input from the user
//subtract two arrays using for loop
//resultant array for storing
//one more array for storing the negative no's
public class ArraySubtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] array1 = new int[n];
		System.out.println("Enter the first Array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}

		int[] array2 = new int[n];
		System.out.println("Enter the second array");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		int[] resArray = new int[n];
		int[] negArray = new int[n];
		for (int i = 0; i < array1.length; i++) {
			resArray[i] = array1[i] - array2[i];
		}
		System.out.print("Resultant Array: ");
		for (int i = 0; i < resArray.length; i++) {
			System.out.print(resArray[i] + " ");

		}
		System.out.println("");
		System.out.print("Negative array :");
		for (int i = 0; i < resArray.length; i++) {
			if (resArray[i] < 0) {
				negArray[i] = resArray[i];
				System.out.print(negArray[i] + " ");
			}
		}

	}

}
