package vehicle_oops;

public class Bike extends vehicle{

	private String type;
	
	public Bike(int a,int b,String c,String t)
	{
		super(a,b,c);
		this.type=t;
	}

	void BikeOutput()
	{
		super.vehicleOutput();
		System.out.println("Bike Type="+this.type);
	}
}
