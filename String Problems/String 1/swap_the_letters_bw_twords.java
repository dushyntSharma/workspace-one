
public class swap_the_letters_bw_twords {
	public static void main(String[] args)
	{
	String ip=new String("Hello world");
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
	for(int i=0;i<array.length;i++)
	{
	System.out.print(array[i]+" ");	
	}
	String[] array2=new String[count+1];
	System.out.println();
	System.out.print(array[0].charAt(0));
	for(int i=1;i<array[1].length()-1;i++)
	{
		System.out.print(array[1].charAt(i));
	}
	System.out.print(array[0].charAt(array[1].length()-1)+" ");
	System.out.print(array[1].charAt(0));
	for(int i=1;i<array[0].length()-1;i++)
	{
		System.out.print(array[0].charAt(i));
	}
	System.out.print(array[1].charAt(array[0].length()-1)+" ");
}
}