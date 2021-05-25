import java.util.*;
public class Circular_string {
	public static void main(String[] args) {
		boolean flag = false;
		Circular_string c = new Circular_string();
		String input1 = "MNOP";
		String input2 = "NOPM";
		System.out.println("String one is =" + input1);
		System.out.println("String two is =" + input2);
		for (int i = 0; i < input2.length() - 1; i++) {
			if (input1.length() != input2.length()) {
				flag = false;
				break;
			}
			String output = c.check_circular(input2);
			System.out.println("In " + (i + 1) + " Iteration " + output);
			if (input1.equals(output)) {
				System.out.println("Strings are circular");
				flag = true;
				break;
			} else {
				input2 = output;
			}
		}
		if (flag != true) {
			System.out.println("Strings are not circular");
		}
	}
	public String check_circular(String input) {
		String word = "";
		word += (char) (input.charAt(input.length() - 1));
		for (int i = 0; i < input.length() - 1; i++) {
			word += (char) (input.charAt(i));
		}		
		return word;
	}
}
