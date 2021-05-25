
public class String_5 {
	public static void main(String[] args) {
		String input = "12345";
		boolean flag = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
				continue;
			} else {
				flag = false;
				// System.out.println("String contains some characters");
				// break;
			}
		}
		if (flag) {
			System.out.println("String contains only digits");
		} else {
			System.out.println("String contains some characters");
		}

	}

}
