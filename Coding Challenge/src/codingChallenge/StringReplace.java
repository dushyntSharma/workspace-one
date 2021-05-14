package codingChallenge;

//take the input string
//convert it to the char array
//loop through the array
//check for arr i'th ele for vowels
//check the next ele
//if the last ele is z then replace the next ele by a
//check for the consecutive vowels
//print the char array in the new string 
import java.util.Scanner;

public class StringReplace {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s = scan.nextLine();
		char arr[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);

		}
		for (int i = 0; i < arr.length - 1; i++) {// I am good boy
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A'
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				if ((arr[i + 1] != 'a' || arr[i + 1] != 'e' || arr[i + 1] != 'i' || arr[i + 1] != 'o'
						|| arr[i + 1] != 'u' || arr[i + 1] != 'A' || arr[i + 1] != 'E' || arr[i + 1] != 'I'
						|| arr[i + 1] != 'O' || arr[i + 1] != 'U') && (arr[i + 1] != ' ')) {
					if (arr[i + 1] == 'z')
						arr[i + 1] = 'a';
					else if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'
							|| arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
							&& (arr[i + 1] == 'a' || arr[i + 1] == 'e' || arr[i + 1] == 'i' || arr[i + 1] == 'o'
									|| arr[i + 1] == 'u' || arr[i + 1] == 'A' || arr[i + 1] == 'E' || arr[i + 1] == 'I'
									|| arr[i + 1] == 'O' || arr[i + 1] == 'U')) {
						continue;
					} else// ab
						arr[i + 1] = (char) (arr[i + 1] + 1);
				}
			}
		}
		String op = "";
		for (int i = 0; i < arr.length; i++) {
			op += arr[i];
		}
		System.out.println(op);

	}

}