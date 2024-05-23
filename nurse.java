package Hospital;
public class nurse extends person
{
	private int roomno;
	private int floorno;
	public nurse(String a, int b, String c, String t, String disease,int bedno,int roomno, int floorno)
	{
		super(a, b, c);
		this.roomno = roomno;
		this.floorno = floorno;
	}
		void nurseoutput() {
		super.personOutput();
		System.out.println("Room no");
		System.out.println("Floor no");
	}
	
}
