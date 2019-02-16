import java.util.Scanner;
public class Hello{
	
	public static void main  (String args[])
	{
		Scanner s= new Scanner(System.in);
		int a, b;
		
	    System.out.println("Enter no 1");
		a= s.nextInt();
		System.out.println("Enter no 2");
		b= s.nextInt();
		
		System.out.println("SUM="+(a+b));
	}
	}