package org.system;

public class Desktop extends Computer{
	 public void desktopSize()
     {
     	System.out.println("Desktop of the Computer");
     }
	public static void main(String[] args) {
		Desktop ds=new Desktop();
		ds.computerModel();
		ds.desktopSize();
       
	}

}
