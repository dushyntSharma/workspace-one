package stringproblems;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("enter the char");
		int n = sc.nextInt();
		char ch = s.charAt(n);
		System.out.println(ch);
	}

}
