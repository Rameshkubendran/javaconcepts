package overloadOverride;

public class Override {
	public static void main(String args[ ])  {
	       Base obj1 = new Derived(); //reference
	        
	       // As per overriding rules this should call to class Derive's static 
	       // overridden method. Since static method can not be overridden, it 
	       // calls Base's display() 
	       obj1.display();  
	        
	       
	       // Here overriding works and Derive's print() is called 
	       obj1.print();
	        System.out.println("<<<<<<< >>>>>>>>>>>");
   
	       Derived obj2 = new Derived();

	      // obj2.display(); //it will call derived method , not from base class because it is binded with instance variable due to static method.
	       
	      // obj1.derivedInstanceprint(); compile time error ,because its derived class instance method.
	       
	       obj1.disp(); //test for modifiers
	       
	       obj1.disppub(); //test for modifiers hierarcy
	       
	       obj2.variableprint();
	       
	    }
	
	
	/* OUTPUT :
	 * 
	 * --------------------------------OUTPUT ----------------------------------------------

					Static or class method from Base
					Non-static or Instance method from Derived=Ramesh
					<<<<<<< >>>>>>>>>>>
					class method disp from Derived
					class method disppub from Derived
					name=Ramesh
					favirotname=Jothi

	 * 
	 */
}
