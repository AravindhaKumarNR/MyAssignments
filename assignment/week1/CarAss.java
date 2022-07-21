package assignment.week1;

public class CarAss {
	//Methods -->call by reference
	public void applyAccelerate() {
		System.out.println("Car accelerating");
	}
	public void applyBreak() {
		System.out.println("Car braking");
	}
	public void applyGear() {
		System.out.println("Car gear applied");
	}
	public void switchOnAc() {
		System.out.println("Car AC turned on");
		
	}
	public void reverse() {
		System.out.println("Car reverse");
	}
	public void honk() {
		System.out.println("Honking");
	}
	public static void main(String[] args) {
		
		
		CarAss c=new CarAss();
		//Calling the methods 
		c.applyAccelerate();
		c.applyBreak();
		c.applyGear();
		c.switchOnAc();
		c.reverse();
		c.honk();
	}
}
