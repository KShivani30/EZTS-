package Basic;
import java.util.*;
public class package3
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int rows;
	 System.out.print("Enter number of rows:");
	 rows= sc.nextInt();
	 for(int i= rows; i >= 1; --i) { 
		 for(int space = 0; space < rows-i; ++space) 
			 System.out.print(" ");
			 for(int j = i; j <= 2*i-1; ++j) 
			 System.out.print("*");
			 for(int j = 0; j < i-1; ++j) 
			 System.out.print("*"); 
			 System.out.println(); 
			 }
	}
}
