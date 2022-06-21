package programs;

public class Arrayreverse {

	public static void main(String[] args) {
		// Using+ string concatation operator
		String str="Sneha";
		System.out.println("Enter value of string :"+str);
		
		String s=" ";
		int n=str.length();
		
		for(int i=n-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		System.out.println("Reverse the string : "+s);

	}

}
