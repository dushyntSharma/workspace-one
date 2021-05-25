import java.util.*;
public class Reverse_the_string
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String input_str=input.next();
		char array[]=new char[100];
		String st=" ";
		for(int i=input_str.length()-1;i>=0;i--)
		{
			st+=input_str.charAt(i);
			
		}
		System.out.println(st);
		System.out.println(input_str.hashCode());
		System.out.println(st.hashCode());
	}

}
