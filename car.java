package vehicle_oops;

public class car extends vehicle
{
	private String fueltype;

	public car(int a,int b,String c,String type,String fueltype) {
		super(a,b,c);
		this.fueltype=fueltype;
	}
	void caroutput()
	{
		super.vehicleOutput();
		System.out.println("Fueltype= "+this.fueltype);
	}
}
