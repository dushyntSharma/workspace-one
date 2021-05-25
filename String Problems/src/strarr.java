package practice1;
import java.util.Scanner;
public class strarr 
{
	public static void main(String[] args)
	{
		String[] ar1=new String[1];
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the string");
		for(int i=0;i<1;i++)
		{
		ar1[i]=n.nextLine();
		}
	   String st=combstr(ar1);
		System.out.println(st);
	}
	static String combstr(String ar[])
	
	{
	String st2="Hello"+" "+ar[0];
		return st2;
	}

}
