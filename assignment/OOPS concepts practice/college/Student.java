package org.college;

public class Student extends Department {
	
	public void studentName(String name) {
		
		System.out.println("Name:"+name);
	}
	public void studentDepartment(String dept) {
		
		System.out.println("Department"+dept);
	}
	public void studentId(String id) {
		System.out.println("ID:"+id);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.collegeName("ABC");
		s1.collegeCode("1234");
		s1.departmentName("ME");
		s1.studentName("AR");
		s1.studentId("ABC1265");
	}
}

