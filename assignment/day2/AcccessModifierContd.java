package week1.day2;

public class AcccessModifierContd {
	public static void main(String[] args) {
		AccessModifiers b=new AccessModifiers();
		//all the other access modifiers will print as its in the same package
		b.publicMeth();
		b.protectedMeth();
		b.defaultMeth();
		//will not print since its a private method.
		//b.privateMeth();
		
	}
}
