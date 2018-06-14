package abstractTest;

public abstract class Base {
	
	static String name="Ramesh";
	
	public String favirotname="Jothi";

	 // Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
  
     // Non-static method which will be overridden in derived class 
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
