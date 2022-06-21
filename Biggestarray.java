package array;

import java.util.Scanner;

public class Biggestarray 
{
	public static void main(String []arg)
	{
		
	
	int a[]=new int[5];
	System.out.println("Enter value of array");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
			
		}
	}
	System.out.println("maximum element.........."+max);
}}
