import java.util.*;
public class Check_it_contains_sequence
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=new String("this is a problem");
		System.out.println("Enter the string to check");
		String check=input.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				//System.out.println(+i);
				count++;
			}
			
		}
		String[] array=new String[count+1];
		String word="";
		int index=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word+=str.charAt(i);
				array[index]=word;
				count++;
			}
			else
			{
				index++;
				word="";
			}
		}
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[j]);
		}
		boolean flag=false;
		for(int j=0;j<array.length;j++)
		{
			if(array[j].equals(check))
			{
				flag=true;
				//System.out.println("True");
			}
			else
			{
				continue;
				//System.out.println("False");
			}	
		}
		if(flag)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
