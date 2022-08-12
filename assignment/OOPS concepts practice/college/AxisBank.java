package org.college;

public class AxisBank extends BankInfo{
	//Overriding deposit method.
	public void deposit(int deposit) {
		System.out.println("New Overrided Deposit feature");
		System.out.println("Total deposited:"+deposit);
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.fixed(1000000);
		a.deposit(1500000);
		
	}

}
