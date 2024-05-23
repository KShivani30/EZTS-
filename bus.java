package vehicle_oops;

public class bus extends vehicle
{
	private int capacity;

	public bus(int a, int b, String c,String type,String fueltype,int capacity)
	{
		super(a, b, c);
		this.capacity = capacity;
	}
	void busoutput()
	{
		super.vehicleOutput();
		System.out.println("capacity="+ this.capacity);
	}
}

