package array;

import java.util.Scanner;

public class Descending {

	public static void main(String[] args)
	{
		int temp;
		int a[]=new int[5];
		System.out.println("Enter value of array......");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("value of array........");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);	
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	
	}
		System.out.println("after descending order......");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

}}
