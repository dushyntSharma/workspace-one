package bubbleSort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before sorting :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		BubbleSort obj = new BubbleSort();
		obj.bubbleSortTechnique(a);
	}

	private static void bubbleSortTechnique(int[] arr) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("\nAfter sorting :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
