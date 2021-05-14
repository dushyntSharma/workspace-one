package codingChallenge;
//string input from user
//search string
//convert it to lowercase
//another method for String occured 
// take length of the search string 
//subtract it with original string and loop through it
//if found equals then print no of times occured


import java.util.Scanner;

public class StringOccured {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		System.out.println("Enter the String to be searched!");
		String searchStr = sc.nextLine();
		str = lowerCase(str);
		searchStr = lowerCase(searchStr);
		int result = stringOccuredInSentence(str, searchStr);
		System.out.println(result);
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

	private static int stringOccuredInSentence(String str1, String searchStr1) {
		// TODO Auto-generated method stub
		int count = 0;
		char ch[] = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			ch[i] = str1.charAt(i);
		}
		// ch.length = 10
		// sea.length = 3
		for (int i = 0; i <= ch.length - searchStr1.length(); i++) {
			String s = "";
			for (int j = 0; j < searchStr1.length(); j++) {
				s +=  ch[i + j];
				if (s.equals(searchStr1)) {
					count++;
				}
			}
		}
		return count;

	}
}