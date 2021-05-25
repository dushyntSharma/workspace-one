package Array_String_Practice_questions;
//Check whether string is palindrome or not
public class String_13 {

	public static void main(String[] args) 
	{
		String_13 s=new String_13();
		// TODO Auto-generated method stub
String word1="racecar";
String result=s.check_palindrome(word1);
System.out.println(result);
	}
	public String check_palindrome(String word1)
	{
		String word2="";
		for(int i=word1.length()-1;i>=0;i--)
		{
			word2+=word1.charAt(i);
		}
		//System.out.println(word2);
		if(word1.equals(word2))
		{
			return "true";
		}
		else
		{
			return "false";
		}
	}

}
