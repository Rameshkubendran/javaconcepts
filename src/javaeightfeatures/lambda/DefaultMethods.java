package javaeightfeatures.lambda;


/* 
 * Default Methods :
	From Java 8 onwards your interfaces can have method implementations as well.
	These implementations are defined with keyword default.
	The class implementing the interface can access these methods or they can even override the default methods.
	We will define sample interfaces for Printer and Scanner.
 */
public class DefaultMethods {

	public static void main(String args[]) {
		Printer printer = new PrinterAndScanner();	
		printer.print();
	}
}

interface Printer {
	default void print() {
		System.out.println("I can print!");
	}
}

interface Scanner {
	default void scan() {
		System.out.println("I can scan!");
	}
}

class PrinterAndScanner implements Printer, Scanner {
	public void print() {
		Scanner.super.scan();
		Printer.super.print();
	}
}



/*
In above, we see that class PrinterAndScanner scans and prints. 
Thus it combines the functionality of two different types of machines.
The default methods will not break any old instances of the interface.
*/