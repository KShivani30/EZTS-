package Hospital;
	public class doctor extends person 
	{
		private String speciality;
		public doctor(String a,int b,String c,String t) {
			super(a,b,c);
			this.speciality=t;
				}
		void doctorOutput() {
			super.personOutput();
			System.out.println("doctor speciality = "+this.speciality);
		}

	}