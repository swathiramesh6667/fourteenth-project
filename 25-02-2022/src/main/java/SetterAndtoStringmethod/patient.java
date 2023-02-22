package SetterAndtoStringmethod;

public class patient 
{
	//state(variable)
	int patientid;
	String patientname;
	String patientaddress;
	String contactnumber;
	
	//default or zero-parameterized constructor.
	public patient()
	{
		
	}

	

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}



	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}



	public void setPatientaddress(String patientaddress) {
		this.patientaddress = patientaddress;
	}



	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}



	@Override
	public String toString() {
		return "patient [patientid=" + patientid + ", patientname=" + patientname + ", patientaddress=" + patientaddress
				+ ", contactnumber=" + contactnumber + "]";
	}


	public static void main(String[] args) 
	{
	patient patient = new patient();

	//setter
	patient.setPatientid(6667);
	patient.setPatientname("Esther");
	patient.setPatientaddress("Selam");
	patient.setContactnumber("+919876543210");
	
	System.out.println(patient);
	
	
	}

	}


