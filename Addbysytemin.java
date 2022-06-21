package programs;

import java.util.Scanner;

public class Addbysytemin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int c;
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter value of a-");
		int a=r.nextInt();
		
		System.out.println("Enter value of b-");
		int b=r.nextInt();
		
		c=a+b;
		System.out.println("Sum of two numbers:  "+c);
		
		c=a-b;
		System.out.println("Substraction of two numbers:  "+c);
		
		c=a*b;
		System.out.println("Multiplicatition of two numbers:  "+c);
		
		c=a/b;
		System.out.println("Divion of two numbers:  "+c);

	}

}
