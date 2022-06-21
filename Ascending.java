package array;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		System.out.println(" enter Array in the");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
	
		}
		System.out.println("value of previouse.........");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		System.out.println("value after ascending........");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}



	}

}
