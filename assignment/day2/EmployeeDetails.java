package week1.day2;

public class EmployeeDetails {

	public void employeeName(String empName, int empId) {
		System.out.println("Employee Name:"+ empName);
		System.out.println("Employee ID:"+ empId);
	}
	public void getEmployeeAddress(String address) {
		System.out.println("Address:"+address);
	}
	public void empSalary(double salary ) {
		System.out.println("Salary:"+salary);
	}
	public void empMobileNumber(long empMobileNumber) {
		System.out.println("Employee Mobile Number:"+empMobileNumber);
	}
	
	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		e.employeeName("aravind", 101);
		e.getEmployeeAddress("chennai");
		e.empSalary(150000);
		e.empMobileNumber(19215439L);
		
	}
}
