package array;

import java.util.Scanner;

public class AverageAeeay {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int sum = 0;
		double avg;
		System.out.println("Enter value of array");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array in the element.....");
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of the element....."+sum);
		avg=sum/a.length;
		System.out.println("avg of elements......"+avg);
		
	}

}
