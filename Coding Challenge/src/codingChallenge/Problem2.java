package codingChallenge;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the martix");
		int n = sc.nextInt();
		int[][] array1 = new int[n][n];
		System.out.println("Enter the matrix");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				array1[i][j] = sc.nextInt();

			}

		}
		int[][] arr = primaryDiagonal(array1);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + " ");
			}

		}

	}

	public static int[][] primaryDiagonal(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length - i - 1];
				arr[i][arr.length - i - 1] = temp;

			}

		}

		return arr;

	}

}
