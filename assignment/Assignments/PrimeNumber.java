package week2.classes;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=30;int i=2;
		boolean isPrime = true;
		if(n==0||n==1) {
			System.out.println("Not Prime");
		}
		else {
			while(n%i==0) {
				isPrime=false;
				i++;
				break;
			}
			if(isPrime==true) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not Prime Number");
			}
		}

	}
}
