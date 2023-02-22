package com.SetterAndGetter;

public class Employee 
{
	//state(variable)
	int Employeeid;
	String Employeename;
	String Employeeaddress;
	String Employeenumber;
	
	//default or zero-parameterized constructor.
	public Employee()
	{
		
	}

	public int getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}

	public String getEmployeename() {
		return Employeename;
	}

	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}

	public String getEmployeeaddress() {
		return Employeeaddress;
	}

	public void setEmployeeaddress(String employeeaddress) {
		Employeeaddress = employeeaddress;
	}

	public String getEmployeenumber() {
		return Employeenumber;
	}

	public void setEmployeenumber(String employeenumber) {
		Employeenumber = employeenumber;
	}
	
    public static void main(String[] args) {
		
    	Employee employee = new Employee();
    	
    	//setter
    	employee.setEmployeeid(4567);
    	employee.setEmployeename("Swathi");
    	employee.setEmployeeaddress("myl");
    	employee.setEmployeenumber("+919876543210");
    	
    	//getter
    	System.out.println(employee.getEmployeeid());
    	System.out.println(employee.getEmployeename());
    	System.out.println(employee.getEmployeeaddress());
    	System.out.println(employee.getEmployeenumber());
    	
	}
}
	

	

