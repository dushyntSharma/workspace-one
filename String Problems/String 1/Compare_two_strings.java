import java.util.*;

public class Compare_two_strings {
	// put the strings in two arrays
	// convert them to lower case
	// compare two array of strings for equality
	static int count = 0;
	static String first = new String("This is exercise 1");
	static String second = new String("This is Exercise 1");

	public static void main(String[] args) {
		Compare_two_strings cs = new Compare_two_strings();
		String array1 = " ";
		String array2 = " ";
		System.out.println("String1:"+first);
		System.out.println("String2:"+second);
		array1 = cs.convert_to_lower_case(first);
		array2 = cs.convert_to_lower_case(second);
		cs.compare(array1, array2);
	}
	public void compare(String array12, String array22) {
		boolean flag = false;
		for (int i = 0; i < array12.length() - 1; i++) {
			if (array12.charAt(i) == array22.charAt(i)) {
				flag = true;
			} else
				flag = false;
		}
		if (flag) {
			System.out.println(first + " is equal to " + second);
		} else {
			System.out.println("This strings are not equal");
		}
	}
	public String convert_to_lower_case(String array1) {
		String result2 = "";
		for (int j = 0; j < array1.length(); j++) {
			if (array1.charAt(j) != ' ') {
				if (array1.charAt(j) >= 65 && array1.charAt(j) <= 90) {
					result2 += (char) (array1.charAt(j) + 32);
					// System.out.println(result2);
				} else {
					result2 += array1.charAt(j);
				}
			} else {
				continue;
			}
		}
		// System.out.println(result2);
		return result2;
	}
}
