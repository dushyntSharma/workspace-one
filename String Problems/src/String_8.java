
//Count the occurence of a given character
public class String_8 {
	public static void main(String[] args) {
		String input = "Java";
		char c = 'a';
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
