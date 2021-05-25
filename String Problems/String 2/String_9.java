package Array_String_Practice_questions;
//convert String to integer
import java.util.*;
public class String_9
{
	public static void main(String[] args)
	{
		String_9 s=new String_9();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.next();
		int output=s.atoi(input);
		System.out.println("The number is"+output);
	}
	public int atoi(String input)
	{
		int op=0;
		int number;
		int size=input.length();
		for(int i=0;i<size;i++)
		{
			number=((input.charAt(i))-48);
			op=op*10+number;
		}
		return op;
	}

}
