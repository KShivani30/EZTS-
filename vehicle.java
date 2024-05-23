package vehicle_oops;

public class vehicle
{
	 	  private int Model;
		  private int engine;
		  private String color;
		  public vehicle(int a,int b,String c)// constructor
		  {
			  this.Model=a;
			  this.engine=b;
			  this.color=c;
		  
		  }
		  void vehicleOutput()
		  {
			  System.out.println("Model="+this.Model);
			  System.out.println("Engine="+this.engine+"cc");
			  System.out.println("Color="+this.color);
		  }
}

