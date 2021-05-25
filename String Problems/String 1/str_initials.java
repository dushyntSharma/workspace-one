package practice1;
import java.util.*;
public class str_initials {
	public static void main(String[]args) {

		Scanner obj=new Scanner(System.in);
        System.out.println("enter the string:");
		String name=obj.next();

		int len=name.length();

		char[] ch=new char[len];

		for(int i=0;i<len;i++)

			ch[i]=name.charAt(i);

		for(int i=0;i<len;i++) 
		{

			if(ch[i]>='A'&&ch[i]<='Z')
			{

			System.out.print(ch[i]);

			}

			}

		obj.close();

		}
}
