package array;

import java.util.Scanner;

public class Arraysreverse {

	public static void main(String[] args)
	{
		int a[]= new int[5];
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter value of array ellement scanner .........");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Reverse the string.......");
		
		for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.println(a[i]);
		}

	}

}
