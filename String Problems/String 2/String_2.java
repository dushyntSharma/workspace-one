package Array_String_Practice_questions;
import java.util.*;
public class String_2 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String to compare");
		String word1=in.next();
		String word2=in.next();
		boolean flag =false;
		for(int i=0;i<word1.length();i++)
		{
			for(int j=0;j<word2.length();j++)
			{
				if(word1.charAt(i)==word2.charAt(j)||word1.charAt(i)==(char)(word2.charAt(j)+32)||word1.charAt(i)==(char)(word2.charAt(j)-32)
						||word1.charAt(j)==(char)(word2.charAt(i)+32)||word1.charAt(j)==(char)(word2.charAt(i)-32))
				{
					flag=true;
				}
				
			}
		}
		if(flag)
		{
			System.out.println("Strings are anagram to each other");
		}
		else
		{
			System.out.println("Strings are not anagram to each other");
		}
	}

}
