package array;

import java.util.Scanner;

public class Coppyarray {

	public static void main(String[] args)
	{

int a[]= new int[5];
int b[]=new int [5];
System.out.println("Enter array in first array......k");
Scanner s=new Scanner(System.in);
for(int i=0; i<a.length;i++)
{
	a[i]=s.nextInt();
}
/*for(int i=0;i<a.length;i++) 
{
	System.out.println("First array........ "+a[i]);
}
	*/
System.out.println();
System.out.println("Equal to b array.....");
System.out.println();
for(int i=0;i<b.length;i++)
{
	b[i]=a[i];
	System.out.println("Coppy array..........."+b[i]);

}

	}

}
