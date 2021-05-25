package Array_String_Practice_questions;

//Remove duplicate characters from strings
public class String_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Banranas";
		int count = 1;
		String output = "";
		char c;
		boolean flag = true;
		String[] str = new String[5];
		int index = 0;
		for (int i = 0; i < word.length(); i++) {
			// Check if word.charAt(i) is present before it
			int j;
			for (j = 0; j < i; j++) {
				if (word.charAt(i) == word.charAt(j)) {
					break;
				}
			}
			// If not present, then add it to
			// result.
			if (j == i) {
				output+=word.charAt(i);
			}
		}
		
			System.out.println(output);
		}
	}

