package Array_String_Practice_questions;
import java.util.*;
public class Skip_the_inputs {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	for(int i=0;i<11;i++)
	{
		if(i!=a &&i!=b)
		{
			System.out.print(i+" ");
		}
	}
}
}
