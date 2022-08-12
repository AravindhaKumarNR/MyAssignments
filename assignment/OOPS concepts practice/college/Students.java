package org.college;

public class Students {
	public void getStudentInfo(String id) {
		System.out.println("ID:"+id);
	}
	public void getStudentInfo(String id,String name) {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
	public void getStudentInfo(String id,String name,String email,String phoneNumber) {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Phone Number:"+phoneNumber);
	
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo("123ABC", "ARA", "abc@avb.com", "95269");
		
	}

}
