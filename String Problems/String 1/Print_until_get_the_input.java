import java.util.*;
public class Print_until_get_the_input {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	for(int i=0;i<11;i++)
	{
		if(i!=a)
		{
			System.out.println(i+" ");
		}
		else
		{
			break;
		}
	}
}
}
