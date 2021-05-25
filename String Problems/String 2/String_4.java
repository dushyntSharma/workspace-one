package Array_String_Practice_questions;

public class String_4
{
	public static void main(String[] args)
	{
		String word="manojas";
		String word2="";
		String_4 s=new String_4();
		//using iterator
		for(int i=word.length()-1;i>=0;i--)
		{
			word2+=word.charAt(i);
		}
		System.out.println(word2);
		//using recursive
		s.recursive(word);
		//System.out.println(word3);
	}
	public void recursive(String str)
	{
		String word3="";
		if ((str==null)||(str.length() <= 1)) 
		{
	           System.out.println(str); 
		}
	        else
	        {
		System.out.print(str.charAt(str.length()-1)); 
		recursive(str.substring(0,str.length()-1));
	        }
		
	        }
	}


