package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortEqualSortof {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.println("Enter value of array.....");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("Sorting method...Ascednin order........");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
	}

}
