package codingChallenge;

import java.util.Iterator;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		String s1[] = getArrayOfStrings(s);
		String s2 = "";

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length() - 1; j++) {
				if (s1[i].charAt(j) == s1[i].charAt(j + 1)) {
					s2 += (char) ((s1[i].charAt(j)) + 1);

				}
			}

		}
		System.out.println(s2);

	}

	private static String[] getArrayOfStrings(String s) {
		// TODO Auto-generated method stub
		String word = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}

		}
		String[] w1 = new String[count + 1];
		int len = 0;
		s = s + " ";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			} else {
				w1[len] = word;
				word = "";
				len++;
			}
		}

		return w1;
	}

}
