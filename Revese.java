package programs;

import java.util.Scanner;

public class Revese {

	public static void main(String[] args) 
	{
		try (//scanner used to take vale from user at run time
		Scanner s = new Scanner(System.in)) {
			//enter number at run time
			 System.out.println("Enter number : ");
			 
			 //take value and store at n
			 int n=s.nextInt();
			 
			 //1.reverse number by using algorithm
			/* int r=0;
			 while(n!=0)
			 {
				 r=r*10+n%10;
				n= n/10;
				 
			 } */
			  //by using stringbuffer
			// StringBuffer r;
			 StringBuffer sb=new  StringBuffer(String.valueOf(n));
			 sb.reverse();
			 System.out.println("Reverse number by using alogirithm : "+sb);
		}
		 
		

	}

}
