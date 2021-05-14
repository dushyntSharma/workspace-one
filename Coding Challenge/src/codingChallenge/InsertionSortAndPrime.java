package codingChallenge;

//ask user no of elements
//take the array elements
//sorting using insertion sort
//in different method check for the prime no
//print the array after sorting
//print the array of prime no's
import java.util.Scanner;

public class InsertionSortAndPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elemnts");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Sorting");
		printArray(arr);
		InsertionSortAndPrime obj = new InsertionSortAndPrime();
		obj.insertionSortAndPrime(arr);

	}


	private void insertionSortAndPrime(int arr[]) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			// Move elements of arr[0..i-1] to one position ahead
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println("After sorting");
		printArray(arr);
		System.out.println("Prime numbers in the array");
		primeNumber(arr);

	}

	void primeNumber(int array[]) {
		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;
			if (array[i] == 1)
				isPrime = false;
			else {
				// check to see if the numbers are prime
				for (int j = 2; j <= array[i] / 2; j++) {
					if (array[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			// print the number
			if (isPrime)
				System.out.print(array[i] + " ");
		}
	}

	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
