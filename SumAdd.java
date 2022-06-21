package array;

import java.util.Scanner;

public class SumAdd {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int sum=0;
		System.out.println("Enter value of array");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		/*System.out.println("Sum of the array......");
		for(int i=0;i<5;i++)
		{
		
			sum=sum+a[i];
		}
		System.out.println(sum);*/
	}

}
