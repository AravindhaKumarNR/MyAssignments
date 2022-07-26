package week1.day2;

public class Basic2 {
	public static void main(String[] args) {
		//Swapping number
		int a,b,c;
		a=10;b=20;
		System.out.println("Before swapping");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		c=a;a=b;b=c;
		System.out.println("----------------------");

		System.out.println("After swapping");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		System.out.println("----------------------");
		
		int tab=10;
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+tab+"="+i*tab);
		}
		System.out.println("----------------------");
		
		//Star Pattern
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		//Fibanooci series
		int firstNum,secNum, sum;
		firstNum=0;secNum=1;sum=0;
		for(int i=0;i<=10;i++) {
			System.out.print(sum+",");
			sum=firstNum+secNum;
			secNum=firstNum;
			firstNum=sum;
		}
		System.out.println();
		System.out.println("----------------------");


		
		
	}
}
