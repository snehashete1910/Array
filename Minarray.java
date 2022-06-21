package array;

import java.util.Scanner;

public class Minarray {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Enter value of element.......");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("smallest element in array");
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
			min=a[i];
			
		}
		

	}
		System.out.println(min);
		}

}
