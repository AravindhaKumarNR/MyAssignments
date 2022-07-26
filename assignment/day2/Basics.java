package week1.day2;

public class Basics {

	public static void main(String[] args) {
		
		
		//Reversing a number
		for(int j=10;j>0;j--) {
			System.out.println(j);
		}
		
		System.out.println("---------------");
		//Reverse
		int fact=1;
		for(int i=5;i>=1;i--) {
			fact=fact*i;
		
		}
		System.out.println("Factorial is:"+fact);
	}

}
