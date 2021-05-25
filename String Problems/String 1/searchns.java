package practice1;
import java.util.Scanner;
import java.lang.*;
public class searchns
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int[] a=new int[100];
		System.out.println("enter the value of n");
		int n=obj.nextInt();
		System.out.println("enter the array of elements");
		for(int i=0;i<n;i++)
		{
			 a[i]=obj.nextInt();
		}
		System.out.println("enter the key element");
		int key=obj.nextInt();
		searnsort(a,key,n);
		//System.out.println(res);
	}
	static void searnsort(int a[],int key,int n)
	{
		int flag=0;
		for(int j=0;j<=n;j++)
		{
			if(a[j]==key)
			{
				 flag=1;
				
				break;
			}
			else
			{
			  continue;
			}
		}
		if(flag==1)
		{
			System.out.println("true");
		}
		else
		{
		System.out.println("false");
		}
	}

}
