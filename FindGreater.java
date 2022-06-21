package programs;

import java.util.Scanner;

public class FindGreater {

	public static void main(String[] args) 
	{
		int a,b,c;
		try (Scanner m = new Scanner(System.in)) {
			System.out.println("Enter Value of a:  ");
			a=m.nextInt();
			
			System.out.println("Enter Value of b:  ");
			b=m.nextInt();
			
			System.out.println("Enter Value of c:  ");
			c=m.nextInt();
		}
		
		if(a>b && a>c)
		{
			System.out.println("A is greter number  :"+a);
		}
		else if(b>a && b>c )
		{
			System.out.println("B is greter number  :"+b);
		}
		else
		{
			System.out.println("c is greter number  :"+c);
		}
	}

}
