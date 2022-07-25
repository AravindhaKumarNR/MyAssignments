package week1.day2;

public class TestAccessModifiers {
	int c;
	public static void main(String[] args) {
		AccessModifiers d=new AccessModifiers();
		d.protectedMeth();
		d.defaultMeth();
		d.publicMeth();
		d.protectedMeth();
		//variables-->
		/*
		 			*Local
		 			*Global 			
		 */
		TestAccessModifiers a=new TestAccessModifiers();
		a.c=35;
		System.out.println(a.c);
		a.c=45;
		System.out.println(a.c);
		            
	}
}
