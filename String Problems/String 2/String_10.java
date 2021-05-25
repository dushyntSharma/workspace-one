
//Replace a space with given character;
public class String_10
{
	public static void main(String[] args)
	{
		String input="Java is a good";
		String replace="%20";
		String word="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				word+=replace;
			}
			else
				word+=input.charAt(i);
		}
		System.out.println(word);
	}

}
