package com.SetterAndGetter;

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

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getPatientaddress() {
		return patientaddress;
	}

	public void setPatientaddress(String patientaddress) {
		this.patientaddress = patientaddress;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	public static void main(String[] args) 
	{
	patient patient = new patient();

	//setter
	patient.setPatientid(6667);
	patient.setPatientname("Esther");
	patient.setPatientaddress("Selam");
	patient.setContactnumber("+919876543210");
	
	//Getter
	System.out.println(patient.getPatientid());
	System.out.println(patient.getPatientname());
	System.out.println(patient.getPatientaddress());
	System.out.println(patient.getContactnumber());
	}

	}


