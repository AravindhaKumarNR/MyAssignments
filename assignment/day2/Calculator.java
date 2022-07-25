package week1.day2;

public class Calculator {
	//with arguments
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int substraction(int a,int b) {
		int c=a-b;
		return c;
	}
	public void mul(int c,int d) {
		int e=c*d;
		System.out.println("Product "+e);
		
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println("Div :"+c);
		
	}
	//without arguments
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Add:"+c);
		
	}
	public void sub() {
		int a=30;int b=20;
		int c=a-b;
		System.out.println("Sub "+c);
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		//Local variables can be generated for return type methods. with shortcut Ctrl+2+L; will work only for return type methods.
		
		int add = c.add(30, 40);
		
		c.addition();
		c.sub();
		int substraction = c.substraction(60, 40);
		c.mul(33, 10);
		c.div(33, 11);
		
	}
}
