package javaeightfeatures.lambda;


/**
 * A lambda expression can have zero or any number of arguments.
 * Java Lambda Expression Example: No Parameter
 * 
 * @author ramesh.kubendran
 *
 */

interface Sayable {
	public String say();
	//public String say(String name); 
}

public class NoParameter {
	public static void main(String[] args) {
		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
		
	}
}