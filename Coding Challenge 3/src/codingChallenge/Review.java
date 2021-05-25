package codingChallenge;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		getEvenNumber(arr, n);

	}

	public static void getEvenNumber(int arr[], int n) {
		int count = 0, i = 0;
		int countOdd = 0;
		do {
			if (arr[i] % 2 == 0) {
				count++;
			} else {
				countOdd++;
			}
			i++;

		} while (i < n);
		System.out.println("The no of even numbers are: " + count);
		System.out.println("Odd numbers : " + countOdd);

	}

}

//DO WHILE
//int count = 0, i = 0;
//do {
//	if (arr[i] % 2 == 0) {
//		count++;
//
//	}
//	i++;
//
//} while (i < n);
//System.out.println("The no of even numbers are: " + count);
//
//
//SWITCH
//
//	int count = 0, count1 = 0, i = 0;System.out.println("Enter your choice");
//	int choice = sc.nextInt();
//
//	switch(choice)
//	{
//case 1:
//	for (int j = 0; j < arr.length; j++) {
//		if (arr[j] % 2 == 0) {
//			count++;
//		}
//
//	}
//	System.out.println("COunt of even number are: " + count);
//	break;
//
//case 2:
//	for (int j = 0; j < arr.length; j++) {
//		if (arr[j] % 2 != 0) {
//			count1++;
//		}
//
//	}
//	System.out.println("count of odd numbers are: " + count1);
//	break;
//}
