import java.util.Scanner;

public class Square_the_index_value
{
	public static void main(String[] args)
	{
		Matrix_Example m=new Matrix_Example();
		Scanner input=new Scanner(System.in);
	int size;
	System.out.println("Enter the size");
	size=input.nextInt();
	int[][] array =new int[size][size];
	System.out.println("Enter the array elements");
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			array[i][j]=input.nextInt();
		}
	}
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			if((i+j)%2==1)
			{
				array[i][j]*=array[i][j];
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			//array[i][j]=input.nextInt();
			System.out.print(array[i][j]+" ");
		}
		System.out.println("");
	}
	}
}
