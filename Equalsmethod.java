package array;

import java.util.Arrays;
import java.util.Scanner;

public class Equalsmethod {

	public static void main(String[] args)
	
	{
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter vale of array..a...a..");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter value of array b.....");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("Array equals.........");
		boolean c=Arrays.equals(a,b);
		System.out.println("Kya array equals hai?...."+c);
	}

}
