package String;

import java.util.Scanner;

public class MySplitAndReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sentence = sc.nextLine();
		System.out.println();
		System.out.println("Sentence after Splitting");
		String[] stringArray = getArrayOfStrings(sentence);
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
//		System.out.println();
//
//		System.out.println("After swaping if they contain 2 or more vowels");
//		String[] s = swapWords(stringArray);
//		for (int i = 0; i < s.length; i++) {
//			System.out.print(s[i] + " ");
//
//		}
		System.out.println();
		System.out.println("After swaping if there is 2 or more same character");
		String[] s1 = replaceCharacter(stringArray);
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");

		}

	}

	private static String[] swapWords(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			String word = stringArray[i];
			String swapedWord = null;
			int vowelCount = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o'
						|| word.charAt(j) == 'u') {
					vowelCount++;

				}
			}
			if (vowelCount > 1) {
				swapedWord = swap(word);
				stringArray[i] = swapedWord;
			}

		}

		return stringArray;

	}

	private static String[] replaceCharacter(String[] stringArray) {

		for (int i = 0; i < stringArray.length; i++) {

			String swapedWord = null;
			String word = stringArray[i];
			for (int j = 0; j < word.length(); j++) {
				char c = word.charAt(j);
				int count = 0;
				for (int j2 = 0; j2 < word.length(); j2++) {
					if (c == word.charAt(j2)) {
						count++;

					}
				}
				if (count > 1) {
					swapedWord = swap(word);
					stringArray[i] = swapedWord;
				}
			}

		}

		return stringArray;

	}

	static String swap(String word) {

		char first = word.charAt(0);
		char last = word.charAt(word.length() - 1);

		String String2 = "";

		for (int i = 0; i < word.length(); i++) {
			if (i == 0) {
				String2 += last;
			} else if (i == word.length() - 1) {
				String2 += first;
			} else {
				String2 += word.charAt(i);
			}
		}
		return String2;

	}

//	private static String swap(String word) {
//		String String2 = "";
//
//		for (int i = word.length() - 1; i >= 0; i--) {
//			String2 += word.charAt(i);
//		}
//		return String2;
//	}

	private static String[] getArrayOfStrings(String s) {
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
