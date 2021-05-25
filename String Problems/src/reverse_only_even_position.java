import java.util.*;
public class reverse_only_even_position
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String inputstr=new String("we watched movie here");
		int count=0;
		for(int i=0;i<inputstr.length();i++)
		{
			if(inputstr.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] array=new String[count+1];
		String[] array1=new String[count+1];
		String word=" ";
	int	index=0;
		for(int i=0;i<inputstr.length();i++)
		{
			if(inputstr.charAt(i)!=' ')
			{
				word+=inputstr.charAt(i);
				array[index]=word;
			}
			else
			{
				index++;
				word=" ";
			}
		}
		for(int j=0;j<array.length;j++)
		{
		String word2=" ";
			String temp=" ";
			 temp=array[j];
			for(int k=temp.length()-1;k>0;k--)
			{
				word2+=(char)temp.charAt(k);
				array1[j]=word2;
			}
			//array[j]
			//if((char)temp.charAt(j)!="null")
			{
			System.out.print(array1[j]+" ");
			}
		}
	}

}
