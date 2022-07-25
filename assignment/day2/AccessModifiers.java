package week1.day2;

public class AccessModifiers {

	public void publicMeth() {
		System.out.println("Public gets printed");
	}
	private void privateMeth() {
		System.out.println("Private get printed");
	
	}
	protected void protectedMeth() {
		System.out.println("Protected get printed");
	}
	void defaultMeth() {
		System.out.println("Default gets printed");
	}

	
	public static void main(String[] args) {
		AccessModifiers a=new AccessModifiers();
		//will print since public method in same class 
		a.publicMeth();
		//will print since private method in the same class
		a.privateMeth();
		//will print since protected in same class
		a.protectedMeth();
		//will print since default in same class
		a.defaultMeth();
	}

}
