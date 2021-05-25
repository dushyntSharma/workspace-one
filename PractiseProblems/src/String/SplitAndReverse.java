package String;

import java.util.Scanner;

public class SplitAndReverse {
	static String[] words;
	static int length = 0;

	public static void main(String[] args) {

		System.out.println("Enter the String to split words");
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		int count = countSpaces(sentence);

		words = new String[count + 1];
		System.out.println("Sentence before splitting");
		System.out.println(sentence);
		/*
		 * Spli
		 */
		split(sentence);
		displayWords();

		swapIfVowels();
		displaySwapedWords();

	}

	private static void swapIfVowels() {

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
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
				words[i] = swapedWord;
			}

		}

	}

	static String swap(String word) {

		char first = word.charAt(0);
		char last = word.charAt(word.length() - 1);

		String String2 = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			String2 += word.charAt(i);
		}
		return String2;

	}

	private static int countSpaces(String sentence) {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '_' || sentence.charAt(i) == ',') {
				count++;
			}
		}
		return count;
	}

	private static void displayWords() {
		System.out.println("Sentence After splitting");

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	private static void displaySwapedWords() {
		System.out.println("Sentence After Swaping if more than 2 vowels");

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

	private static void split(String sentence) {
		String word = "";
		sentence = sentence + " ";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '_' || sentence.charAt(i) == ',') {
				words[length] = word;
				length++;
				word = "";

			} else {
				word = word + sentence.charAt(i);
			}
		}

	}

}
