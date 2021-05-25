
public class String_7 {
	public static void main(String[] args) {
		String word = "Java is good";
		int vowels_count = 0;
		int space = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
					|| word.charAt(i) == 'O' || word.charAt(i) == 'U') {
				vowels_count++;
			} else if (word.charAt(i) == ' ') {
				space++;
			}
		}
		System.out.println("The number of vowels in string is  " + vowels_count);
		System.out.println("The number of consonents in string is  " + (word.length() - vowels_count - space));
	}

}
