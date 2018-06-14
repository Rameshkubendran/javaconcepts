package overloadOverride;


/*
 * Method overloding is 
 * 
 * - method name should be same and different paramter signature.
 * 
 * - it would be have any kind of method return type .
 * 
 * - we can declare static or non static
 * 
 *   i,e overload will happen same method name with different method signatures.
 */
public class Overloading{

	void test(int a){
		 System.out.println("==>"+a);
	}
	
	void test(int y,String b){
		System.out.println("==>"+y+","+b);
		
	}	
	
	/*void test(int y,String b)	{ // it throws compile time exception because its same argument of already existing method. thats int y, String b . 
	}*/
	
	int test(int y,float b)	{
		
		int xx=(int) b;
		int c=y+Integer.valueOf(xx);
		return c;
		
	}
	
	/* Can we overload static methods?
		The answer is ‘Yes’. We can have two or more static methods with same name, but differences in input parameters. For example, consider the following Java program.
	*/
	
	   public static void foo() {
	        System.out.println("Test.foo() called ");
	    }
	    public static void foo(int a) { 
	        System.out.println("Test.foo(int) called ");
	    }
	  
	   /* Ends static overload */
	    
	public static void main(String[] args) {
		
		Overloading ovr=new Overloading();
		ovr.test(10);
		ovr.test(11,"ramesh");
		
		System.out.println(ovr.test(20,20));
		
		System.out.println("\n<<<< overload static methods >>>>>>\n");

		Overloading.foo();
		
    	Overloading.foo(10);
	}
	
	/*
	 *  OUTPUT :
	 *  
	 *  ==>10
		==>11,ramesh
		40

		<<<< overload static methods >>>>>>

		Test.foo() called 
		Test.foo(int) called 

	 * 
	 */
}
