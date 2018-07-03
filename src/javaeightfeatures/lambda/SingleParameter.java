package javaeightfeatures.lambda;

/**
 * A lambda expression can have zero or any number of arguments.
 * Java Lambda Expression Example: Single Parameter
 * 
 * @author ramesh.kubendran
 *
 */
interface SayableSP{  
    public String say(String name);  
    //public String say();
}  
  
public class SingleParameter{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
    	SayableSP s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        SayableSP s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
}  



/* Example 2 */

/*

@FunctionalInterface
interface MyFunctionalInterface {

	//A method with single parameter
    public int incrementByFive(int a);
}
public class Example {

   public static void main(String args[]) {
        // lambda expression with single parameter num
    	MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
} */