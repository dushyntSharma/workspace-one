package Array_String_Practice_questions;
//Remove the character from the string
import java.util.*;
public class String_18 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner in=new Scanner(System.in);
		String input=in.next();
		System.out.println("Enter the character to be deleted");
		char c=in.next().charAt(0);
		String output="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==c)
			{
				
			}
			else
			{
				output+=input.charAt(i);
			}
		}
		System.out.println(output);
	}

}
