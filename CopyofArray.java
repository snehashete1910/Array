package array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyofArray {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		System.out.println("Enter value of array......");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=Arrays.copyOf(a, 5);
		System.out.println("copy of.........");
		for(int i=0;i<a.length;i++)
		{
		
		System.out.println(b[i]);
		}
	}

}
