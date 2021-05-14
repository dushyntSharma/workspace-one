package codingChallenge;
//Take the input of rows and column from the user

//print the 2D array
//create max and min variable of 2D array size
//loop through the array
//get the max[i][j]
//get the min[i][j]
//swap using simple swap
//print array

import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[]) {
		System.out.print("Enter 2D array size : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();

		System.out.println("Enter array elements : ");

		int twoD[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twoD[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nData you entered : \n");
		for (int[] x : twoD) {
			for (int y : x) {
				System.out.print(y + "        ");
			}
			System.out.println();
		}

		double max = twoD[0][0];
		double min = twoD[0][0];
		int maxIndex1 = 0;
		int maxIndex2 = 0;
		int minIndex1 = 0;
		int minIndex2 = 0;

		System.out.println("The matrix is : ");
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {

				if (twoD[i][j] > max) {
					max = twoD[i][j];

					maxIndex1 = i;
					maxIndex2 = j;
				} else if (twoD[i][j] < min) {
					min = twoD[i][j];

					minIndex1 = i;
					minIndex2 = j;
				}
			}
		}
		int temp = twoD[maxIndex1][maxIndex2];
		twoD[maxIndex1][maxIndex2] = twoD[minIndex1][minIndex2];
		twoD[minIndex1][minIndex2] = temp;

		System.out.print("\nAfter Swapping: \n");
		for (int[] x : twoD) {
			for (int y : x) {
				System.out.print(y + "        ");
			}
			System.out.println();
		}

	}

}