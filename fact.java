package Basic;

import java.util.Scanner;

public class fact {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int num;
		int fact=1;
		System.out.print("Enter any number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a given number is:" +fact);
	}
}