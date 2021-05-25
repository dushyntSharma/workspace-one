import java.util.*;
public class Word_count {
	static Scanner in =new Scanner(System.in);
	//static String input=" ";
	static int count =0;
	static int count2 =0;
	public static void main(String[] args)
	
	{
		String input=" I am too Good";
	//	 String input=" ";
		int choice;
		do
	{
		System.out.println("Enter the choice");
		System.out.println("1.Enter the string");
		System.out.println("2.Count the number of words in string");
		System.out.println("3.Count the number of vowels in string");
		System.out.println("4.convert string to string array");
		 choice=in.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Input string is");
		
		   //input=in.nextLine();
		  System.out.println(input);
		 //input=get_input();
		break;
		case 2:for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				count++;
			}
			else
			{
				continue;
			}
			
		}
		System.out.println("The number of words in string is"+count);
		break;
		case 3:for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='A'||input.charAt(i)=='E'||
					input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U')
			{
				count2++;
			}
			else
			{
				continue;
			}
			
		}
		System.out.println("The number of vowels in string is"+count2);
		break;
		case 4:String[] array=new String[count+1];
		String word="";
		int index=0;
		for(int j=0;j<input.length();j++)
		{
			if(!(input.charAt(j)==' '))
			{
				word+=input.charAt(j);
				array[index]=word;
			}
			else
			{
				index++;
				word="";
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		break;
		}
		}while(true);
		
		
	}
	public static String get_input()
	{
		String inp=in.nextLine();
		return inp;
	}

}
