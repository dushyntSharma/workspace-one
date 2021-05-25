package Array_String_Practice_questions;
//Find the counts of duplicate variable
public class String_6 
{
	public static void main(String[] args)
	{
		String input="Programming";
		int count =1;
		boolean flag=false;
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				
				if(input.charAt(i)==input.charAt(j))
				{
					flag=true;
					count++;
				}
			}
			if(flag==true&&count>1)
			{
				System.out.println(input.charAt(i)+" : "+ count);
				count=1;
			}
		}
	}

}
