
public class String_1 {
	public static void main(String[] args) {
		String word = "Java";
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.println("Repeated character is : " + word.charAt(j));
				}
			}
		}
	}

}
