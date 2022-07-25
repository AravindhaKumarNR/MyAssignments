package week1.day2;

public class Emp {
	
	public void employeeDetails(String name,int id,String address,long mobile) {
		System.out.println("Name of the employee:"+name);
		System.out.println("ID Details:"+id);
		System.out.println("Address:"+address);
		System.out.println("Contact Number:"+mobile);
	}
	//with return statement
	
	public String getEmpName(String name,int id,String address,long mobile) {
		return name;
		
	}
	public static void main(String[] args) {
		Emp e=new Emp();
		e.employeeDetails("Aravindha Kumar", 1001, "Pazhavanthangal", 95268213523L);
		System.out.println("----------------");
		String empName = e.getEmpName("Aravindha Kumar", 1001, "Pazhavanthangal", 95268213523L);
		System.out.println(empName);
		
		
		
	}
}
