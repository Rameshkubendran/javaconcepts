package abstractTest;

public class AbstractClassTest extends Base {
	 String name="Ramesh123";
	 String favirotname="Deekshitha";
	 
   // This method hides display() in Base 
   public static  void display() {
        System.out.println("Static or class method from Derived");
   }
    
  
   // This method overrides print() in Base 
   public void print() {
        System.out.println("Non-static or Instance method from Derived");
  }
   
   public void printmembers() {
       System.out.println("name==>"+name);
       System.out.println("favirotname==>"+favirotname);
 }
   
   public static void main(String args[])  {
       Base obj1 = new AbstractClassTest(); 
       obj1.display();
       obj1.print();
      
       
       AbstractClassTest abstractClassTest=new AbstractClassTest();
       abstractClassTest.printmembers();
       
   }     
  
 }
