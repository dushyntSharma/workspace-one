package practice1;
import java.util.*;
public class rev_the_strings 
{
	public static String Reverse(String value)
	{
		int len=value.length();
		char myChar = value.charAt(0);      //it returns the first char of the string.

		if (Character.isDigit(myChar))
		{
		   return value;
		}
		String rev= "";
		for (int i = len - 1 ; i >= 0 ; i--)
		{
		rev = rev + value.charAt(i);
		}
		return rev;
	}
    public static void main(String a[])
    {
    String str;
    Scanner obj=new Scanner(System.in);

    str=obj.nextLine();
    String delims = " ";

    StringTokenizer st = new StringTokenizer(str, delims);     //It is used to break a string into tokens:
    		int len=st.countTokens();

            String[] array= new String[len];
            int i=0;
             while (st.hasMoreTokens())
             {
                array[i++]=st.nextToken();
             }
             for(int j=0;j<len;j++)
             {
            	 array[j]=rev_the_strings.Reverse(array[j]);            	 
             }
             for(int j=0;j<len;j++)
             {
            	 System.out.print(array[j]+" ");
             }
             obj.close();
     }
}
