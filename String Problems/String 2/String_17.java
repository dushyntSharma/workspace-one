package Array_String_Practice_questions;
import java.util.*;
public class String_17 
{
	public static void main(String[] args)
	{
		String input="aaaaaabbbbbbccc";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					count++;
				}
			}
			
			System.out.println(count+" "+input.charAt(i));
			count=0;
			//break;
		}
	}

}
