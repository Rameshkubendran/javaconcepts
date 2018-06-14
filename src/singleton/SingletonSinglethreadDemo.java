package singleton;

public class SingletonSinglethreadDemo {
	public static void main(String[] args) {
		
		MySingleTon tmp = MySingleTon.getInstance( );
		tmp.msg();  
		tmp.msg();
		
	    MySingleTon tmp1 = MySingleTon.getInstance( );
	    tmp1.msg();
	    		     
	   }
}
