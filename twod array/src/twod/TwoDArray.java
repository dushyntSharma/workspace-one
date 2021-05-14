package twod;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int s = sc.nextInt();
		System.out.println("Enter the elements");
		int[][] arr = new int[s][s];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("\nThe diagonal elements are :");
		diagonalElement(arr);

	}

	private static void diagonalElement(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");

				}

			}

		}

	}

}
