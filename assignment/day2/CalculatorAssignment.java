package week1.day2;

public class CalculatorAssignment {
	public int additionTwoNumber(int a,int b) {
		int c=a+b;
		return c;
	}
	public int substractionTwoNumber(int e, int f) {
		int g=e+f;
		return g;
	}
	public double multiplyTwoNumber(double i,double j) {
		double g=i*j;
		return g;
	}
	public float divideTwoNumber(float x,float y) {
		float z=x/y;
		return z;
	}
	public static void main(String[] args) {
		CalculatorAssignment c=new CalculatorAssignment();
		System.out.println(c.additionTwoNumber(20,20));
		System.out.println(c.substractionTwoNumber(50, 40));
		System.out.println(c.multiplyTwoNumber(22.50, 11.22));
		System.out.println(c.divideTwoNumber( 103.50f, 10.55f));
		
	}

}
