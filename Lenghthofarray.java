package array;

import java.util.Scanner;

public class Lenghthofarray {

	public static void main(String[] args) {
		int n=2;
		int a[]=new int[n];
		System.out.println("Enter array in .......");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		///want to show result what u pass the array
		System.out.println("Number of array in list");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		
		}
		System.out.println("  "+"length of array   "+a.length);	

}}
