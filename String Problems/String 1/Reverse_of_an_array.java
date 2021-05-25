
public class Reverse_of_an_array {
public static void main(String[] args)
{
	int[] array= {1,2,3,4,5};
	boolean flag=false;
	for(int i=0;i<5;i++)
	{
		if(array[i]==0 &&array[i]==1)
		{
			flag=true;
		}
		if(array[i]/(array[i]/2)==0)
				{
			flag=true;
				}
		
	}
	if(flag)
	{
		System.out.println("yess its palindromic");
	}else
	{
		System.out.println("not a palindromic");
	}
}
}
