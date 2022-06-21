package array;

import java.util.Scanner;

public class Equaloperator {

	public static void main(String[] args) 
	{
		//only check the referance variable not matter with data
		// so op is false
		
		
		int a[]=new int[5]; 
		int b[]=new int[5];
		System.out.println("Enter value of array... a...");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter value of b.........");
		for(int j=0;j<b.length;j++)
		{
			b[j]=s.nextInt();
			
		}
		if(a==b)
		{
			System.out.println("Arrays are equal........");
		}
		else
		{
			System.out.println("Arrays are not equal........");
		}
	}

}
