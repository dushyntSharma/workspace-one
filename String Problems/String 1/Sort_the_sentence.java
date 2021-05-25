
public class Sort_the_sentence
{
	public static void main(String[] args)
	{
		String ip=new String("This is a great day");
		int count=0;
		for(int i=0;i<ip.length();i++)
		{
			if(ip.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] array=new String[count+1];
		int index=0;
		String word="";
		for(int i=0;i<ip.length();i++)
		{
			if(ip.charAt(i)!=' ')
			{
				word+=ip.charAt(i);
				array[index]=word;
			}
			else
			{
				index++;
			    word="";
			}
		}
		for(int j=0;j<array.length;j++)
		{
			//int small=array[j].length();
			for(int i=j+1;i<array.length;i++)
			{
				if(array[i].length()<array[j].length())
				{
					String temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
				else
				{
					continue;
				}
			}
		}
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j]+" ");
		}
	}

}
