package Basic;
import java.util.*;
public class pattern2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int space, rows; 
	    System.out.println("Enter number of rows:");
	    rows=sc.nextInt(); 
	    for(int i = 1, k = 0; i <= rows; ++i, k = 0) { 
	        for(space = 1; space <= rows-i; ++space) { 
	           System.out.print(" "); 
	        } 
	        while(k != 2*i-1) { 
	            System.out.print("*"); 
	            ++k; 
	        } 
	        System.out.println();
	    }     
	     sc.close();
	}
}
