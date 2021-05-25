package practice1;
import java.util.*;
public class String_compress
{
	static void Compress(String str2) 
	{ 
		for (int i = 0; i < str2.length(); i++)
		{ 
         	int count = 1; 
				while(i+1<str2.length()&&str2.charAt(i)==str2.charAt(i+1))
			{ 
             i++; 
             count++; 
            }
			System.out.print(str2.charAt(i)+""+count+" "); 
		}   
	} 
	public static void main(String args[]) 
	{ 
		Scanner obj= new Scanner(System.in);
        System.out.println("enter the string");
		String str=obj.next();

		int len=str.length();

		char[]ch=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<len;i++)
		{
		if(ch[i]>='A' && ch[i]<='Z')
        { 

			ch[i]=(char)((int)ch[i]+32);

        }
		}
		String str2 = String.valueOf(ch);//method converts any type of values into string.

		String_compress.Compress(str2);
		
		obj.close();
	}
}
