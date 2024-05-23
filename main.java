package Hospital;
import java.util.*;
public class main {

public static void main(String[] args) 
{
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the person name");
			  String m=sc.next();
			  System.out.println("Enter the person age");
			  int e=sc.nextInt();
			  System.out.println("Enter the person gender");
			  String s=sc.next();
			  System.out.println("Enter the doctor speciality");
			  String t=sc.next();
			  System.out.println("Enter the patients disease");
			  String disease=sc.next();
			  System.out.println("Enter the patients bedno");
			  int bedno=sc.nextInt();
			  System.out.println("Enter the nurse room no");
			  int roomno=sc.nextInt();
			  System.out.println("Enter the nurse floor no");
			  int floorno=sc.nextInt();
			  doctor d=new doctor(m,e,s,t);
			  d.doctorOutput();
			  patient p=new patient(m,e,s,t,disease,bedno);
			  p.patientoutput();
		      nurse n=new nurse(m,e,s,t,disease,bedno,roomno,floorno);
		      n.nurseoutput();
		  }
		}
