package vehicle_oops;
import java.util.*;
public class main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//vehicle vh1=new vehicle();
		System.out.println(" Enter the vehicle model");
		int m=sc.nextInt();
		System.out.println(" Enter the vehicle engine"+" cc");
		int e=sc.nextInt();
		System.out.println(" Enter the vehicle color");
		String s=sc.next();
		System.out.println(" Enter the vehicle type");
		String t=sc.next();
		System.out.println("Enter the fuel type");
		String fueltype=sc.next();
		System.out.println("Enter the capacity of the bus");
		int capacity=sc.nextInt();

		Bike b= new Bike(m,e,s,t);
		b.BikeOutput();
		
		car c=new car(m,e,s,t,fueltype);
		c.caroutput();
		
		bus x = new bus(m,e,s,t,fueltype,capacity);
		x.busoutput();
		
	}
}
