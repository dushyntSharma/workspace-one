import java.util.*;

public class Shuffle_the_string {
	public static void main(String[] args) {
		String input = new String("atmosphere");
		String word1 = "";
		String word2 = "";
		String output = "";
		// char[] output = new char[input.length()];
		int size = 0;
		if (input.length() % 2 == 0) {
			size = input.length() / 2;
		} else {
			size = (input.length() / 2) + 1;
		}
		for (int k = 0; k < input.length(); k++) {
			if (k < size) {
				word1 += (char) input.charAt(k);
			} else {
				word2 += (char) input.charAt(k);
			}
		}
		String word3 = "";
		for (int i = word2.length() - 1; i >= 0; i--) {
			word3 += (char) (word2.charAt(i) - 32);
		}
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		for (int m = 0; m < word1.length(); m++) {
			if (word1.charAt(m) >= 65 && word1.charAt(m) <= 90) {
				output += (char) (word1.charAt(m) + 32);
			} else {
				output += (char) word1.charAt(m);
			} // while(m<word3.length())
			if (m < word3.length()) {
				output += (char) word3.charAt(m);
			}
		}
		System.out.println(output);
	}
}
