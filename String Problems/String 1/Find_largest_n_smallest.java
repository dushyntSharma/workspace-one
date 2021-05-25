import java.util.*;
public class Find_largest_n_smallest {
public static void main(String[] args)
{
	int[] array=new int[5];
	System.out.println("Enter the array elements");
	Scanner in=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		array[i]=in.nextInt();
	}
	int large=0;
	for(int j=0;j<4;j++)
	{
		large=array[j];
		if(array[j+1]>large)
		{
			large=array[j+1];
		}
	}
	int small=0;
	for(int j=0;j<4;j++)
	{
		small=array[j];
		if(array[j+1]<small)
		{
			small=array[j+1];
		}
	}

	System.out.println("Largest number is"+large);
	System.out.println("Smallest number is"+small);
}
}
