package codingChallenge;
//length of the matrix
//take the inputs in twoD array
//2 methods for diagonal elemnts
//i==j means diagonal
//that ele / no of times
//similarly for reverse

import java.util.Scanner;

public class ThreeDimension {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the length of the matrix");
		int a = sc.nextInt();
		System.out.println("Enter matrix elements:");
		int arr[][] = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The average of odd elements in primary diagonal array are");
		System.out.println(primaryDiagonal(arr));
		System.out.println("The average of odd elements in secondary diagonal array are");
		System.out.println(secondaryDiagonal(arr));
	}

	public static float primaryDiagonal(int arr[][]) {

		int a = arr.length;
		float temp = 0;
		int count = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				//0=0
				if (i == j) {	
					if (arr[i][j] % 2 != 0) {
						temp += arr[i][j];
						count++;
					}
				}
			}
		}
		if (count != 0)
			return temp / count;
		else
			return 0;
	}

	public static float secondaryDiagonal(int arr[][]) {

		int a = arr.length;
		float temp = 0;
		int count = 0;
		for (int i = 0; i < a; i++) {	//0,2
			for (int j = arr[i].length - 1; j >= 0; j--) {
				if (i + j == arr[i].length - 1) {
					if (arr[i][j] % 2 != 0) {

						temp += arr[i][j];
						count++;
					}
				}
			}
		}
		if (count != 0)
			return temp / count;
		else
			return 0;
	}

}
