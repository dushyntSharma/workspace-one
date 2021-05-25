

public class String_3
{
	public static void main(String[] args)
	{
		String word="MornMoing";
		for(int i=0;i<word.length();i++)
		{
			for(int j=1;j<word.length();j++)
			{
				//temp=word.charAt(i);
				if(word.charAt(i)==word.charAt(j))
				{
					i++;
				}
			}
				System.out.println(word.charAt(i));
				//break;
				System.exit(0);
			
		    
		     }
	}

}
