import java.util.*;

public class String_square_matrix {
	public static void main(String[] args)
	{
		int row=0;
		int col=0;
		String str="";
		String[][] array=new String[3][3];
		Scanner in=new Scanner(System.in);
		do
		{
		System.out.println("Enter the choice");
		System.out.println("1.Enter the size of matrix");
		System.out.println("2.Enter the Elements");
		System.out.println("3.Enter the search string");
		int ch=in.nextInt();
		
		switch(ch)
		{
		case 1:
		
		System.out.println("Enter the size  of row and coloumn");
		row=in.nextInt();
		 col=in.nextInt();
		break;
		case 2:
		//String[][] array=new String[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=in.next();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		break;
		case 3:
			System.out.println("Enter the search string");
			 str=in.next();
			 boolean flag=true;
			 for(int i = 0;i<row;i++)
				{
					for (int j = 0; j < col; j++) {
						if ( str.equals(array[i][j])) {
							System.out.println("String found in" + i + j + " position");
						} else {
							flag=false;
						}

					}
				
				}
			 if(flag==false)
			 {
				 System.out.println("String not found");
			 }
			break;
    }
		
	//}while(true);
	
	}while(true);
}
}
