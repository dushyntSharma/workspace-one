import java.util.*;

//package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class simple_example {

	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader((System.in)));
		PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(input.readLine().trim());
		for(int i=0;i<t;i++)
		{
			String[] arr=input.readLine().split(" ");
			long a=Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			//long c=Long.parseLong(arr[3]);
			//long d = Long.parseLong(arr[4]);
			System.out.println(max(a,b));
			//System.out.println(max(c,d));
			
		}
		input.close();
		out.flush();
	}
	static long max(long a,long b)
	{
		if(b-a==1)
			return(b&a);
		else if((b&1)==0)
			return ((b-1)&(b-2));
		else
			return (b&(b-1));
		
		
	}
	
}