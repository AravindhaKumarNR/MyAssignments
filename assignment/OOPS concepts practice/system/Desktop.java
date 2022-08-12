package org.system;

public class Desktop  extends Computer{	

	public void desktopSize(int sizeOfDesktop) {
		int size=sizeOfDesktop;
		System.out.println("Size of the desktop is :"+ size+"running");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();	
		d.desktopSize(32);
		d.chromeOS();
	}
}
