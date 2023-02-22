package SetterAndtoStringmethod;

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

	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}

	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}

	public void setEmployeeaddress(String employeeaddress) {
		Employeeaddress = employeeaddress;
	}

	public void setEmployeenumber(String employeenumber) {
		Employeenumber = employeenumber;
	}

	@Override
	public String toString() {
		return "Employee [Employeeid=" + Employeeid + ", Employeename=" + Employeename + ", Employeeaddress="
				+ Employeeaddress + ", Employeenumber=" + Employeenumber + "]";
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setEmployeeid(9087);
		employee.setEmployeename("Dhivya");
		employee.setEmployeeaddress("Seol");
		employee.setEmployeenumber("+919876543210");
		
		System.out.println(employee);
		
	}
	
}
	

	

