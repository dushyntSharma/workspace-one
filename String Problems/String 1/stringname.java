package practice1;
import java.util.Scanner;
public class stringname 
{
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str=n.nextLine();
	String	str2 =str1name(str);
		System.out.println(str2);
	}
    static String str1name(String str)
    {
    	str="hello"+" "+str;
    	return str;
    }
}
