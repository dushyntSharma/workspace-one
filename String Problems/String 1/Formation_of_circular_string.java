import java.util.*;
public class Formation_of_circular_string
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.next();
		System.out.println("Enter the number");
		int number=in.nextInt();
		String[] array=new String[input.length()];
		String word="";
		int index=0;
		for (int j = 0; j < input.length(); j++) {
			if (j < input.length() - (number - 1)) {
		for(int i=j;i<(j+number);i++)
		{
			word+=input.charAt(i);
			array[index]=word;	
		}
		index++;
		word="";
			}
			else
			{
				//input.length()-(number-1)
				for(int i=j;i<input.length();i++)
				{
				word+=input.charAt(i);
				
				}
				for(int k=0;k<=(number)-word.length();k++)
				{
					word+=input.charAt(k);
					array[index]=word;
				}
				index++;
				word="";
			}
		}	
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
