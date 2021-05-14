package codingChallenge;

import java.util.Scanner;

public class ReplaceAndInsertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String[] s = getStringArray(str);
		System.out.println(s);
	}

	private static String[] getStringArray(String str) {
		// TODO Auto-generated method stub
		char ch = 0;
		int count = 0;
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				count++;
		}
		String[] words = new String[count + 1];
		str = str + " ";
		int len = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				word += ch;
				count++;
			} else {
				words[len] = word;
				word = "";
				len++;
			}
		}

		return words;
	}

}
