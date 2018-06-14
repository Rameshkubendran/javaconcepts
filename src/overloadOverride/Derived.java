package overloadOverride;

public class Derived extends Base {
    
   // This method hides display() in Base 
   public static void display() {
        System.out.println("Static or class method from Derived");
       // return 0;
   }
    
   public void disp() { //modifier testing , if u modify the modifier as private compile
	   //time exception will occure 
	   	//, should be in the following hierarchy  public ,protected,private .
	   //so 1. when u declare base class as public then derived  class should be public
	   // 
       System.out.println("class method disp from Derived");
   }
   
   
   public void disppub()
   {// 2. if u declare derived class public u can declare any base as private or protected modifiers , 
	   //cant declare as default.
       System.out.println("class method disppub from Derived");

   }
   // This method overrides print() in Base 
   public void print() {
        System.out.println("Non-static or Instance method from Derived="+name);
  }
   
   public void derivedInstanceprint() {
       System.out.println("derivedInstanceprint method from Derived");
   }
   
   public void variableprint() {
       System.out.println("name="+name);
       System.out.println("favirotname="+favirotname);
 }
   
  //  static String name="Ramesh123";
	// String favirotname="jack123";
	 
 }

