package Hospital;
public class patient extends person
{
 private String disease;
 private int bedno;
public patient(String a, int b, String c,String t, String disease, int bedno) {
	super(a, b, c);
	this.disease = disease;
	this.bedno = bedno;
}
  void patientoutput()
 {
	 super.personOutput();
	 System.out.println("Disease of the patient:"+this.disease);
	 System.out.println("Bed no of the patient:"+this.bedno);
 }
}
