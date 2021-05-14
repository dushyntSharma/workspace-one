package codingproblem2;

import java.util.Scanner;

public class CodingChallenge {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		String[] s = getArrayOfString(str);
		System.out.println(s);
		
		String sn = "";
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < s[i].length(); j++)
					sn += (char) ((s[i].charAt(j)) + 1);

			} else {
				for (int j = s[i].length() - 1; j >= 0; j--) {
					if (s[i].charAt(j) >= 97 && s[i].charAt(j) <= 122)
						sn += (char) ((s[i].charAt(j)) - 32);
					else
						sn += s[i].charAt(j);
				}
			}
			sn += " ";

		}
		System.out.println(sn);

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
			if (string.charAt(i) != ' ' || string.charAt(i) != '_' || string.charAt(i) != '.'
					|| string.charAt(i) != ',') {
				word = word + string.charAt(i);
			} else {
				words[length] = word;
				word = "";
				length++;
			}
		}
		return words;
	}

}
