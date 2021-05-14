package challenge3;

import java.util.Scanner;

public class CodingChallenge3 {
	static final int c = 256;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.nextLine();
		String str = lowerCase(s1);
		String[] s = getArrayOfString(s1);
		String temp = "";
		String s2 = "";
		String s3 = "";
		int flag = 0;
		if (s.length > 2) {
			System.out.println("Enter two words length sentence only ");
		} else {

			for (int i = s.length - 1; i >= 0; i--) {
				temp += s[i] + " ";

			}
//			System.out.println(temp);

			int[] count = new int[c];

			int i;
			for (i = 0; i < temp.length(); i++) {
				if (temp.charAt(i) != ' ')
					count[(int) temp.charAt(i)]++;
				if (temp.charAt(i) == ' ')
					count[(int) temp.charAt(i)] = 1234;
			}
			int n = i;

			for (i = 0; i < n; i++) {
				if (count[(int) temp.charAt(i)] == 1)
					System.out.print(temp.charAt(i));
				if (count[(int) temp.charAt(i)] == 1234)
					System.out.print(" ");
			}

		}

	}

	private static String[] getArrayOfString(String string) {
		String word = "";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ')
				count++;
		}
		String[] words = new String[count + 1];
		int length = 0;
		string = string + " ";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				word = word + string.charAt(i);
			} else {
				words[length] = word;
				word = "";
				length++;
			}
		}
		return words;
	}

	public static String lowerCase(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 91) {
				res = res + (char) ((int) ch + 32);
			} else
				res = res + ch;

		}
		return res;
	}

}
