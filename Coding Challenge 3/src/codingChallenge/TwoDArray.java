package codingChallenge;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		System.out.println("Before sorting");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		swapElements(arr);

	}

	public static void swapElements(int arr[][]) {
		int i = 0, j = arr.length;

		while (i < j) {
			int temp = arr[i][i];
			arr[i][i] = arr[j - 1][j - 1];
			arr[j - 1][j - 1] = temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < arr.length; j2++) {
			for (int k = 0; k < arr.length; k++) {
				if (j2 != k) {
					arr[j2][k] = arr[j2][k] * arr[j2][k];
				}

			}

		}
		System.out.println("After Swaping");
		for (int i1 = 0; i1 < arr.length; i1++) {

			for (int j1 = 0; j1 < arr.length; j1++) {
				System.out.print(arr[i1][j1] + " ");
			}
			System.out.println();

		}

	}

}
