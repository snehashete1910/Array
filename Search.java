package array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args)
	{
	//.args a[]= {12,16,5,9,8};	
	int a[]=new int[5];
	int n;
	int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter arrray element");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("values in a");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("Search element.......");

	
	n=s.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==n)
		{
			count++;
		}
		}
		if(count>0)
			System.out.println("item found......."+count);
		
		else
		
			System.out.println("Item not found......"+count);
		
	
}
}