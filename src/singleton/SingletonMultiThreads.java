package singleton;

public class SingletonMultiThreads {
	public static void main(String[] args) {

	    new Thread (new Runnable(){
	        public void run(){
	        	MySingleTon s = MySingleTon.getInstance();
	            s.work();}
	    }).start();

	    System.out.println("main thread");

	    new Thread(new Runnable() { 
	         public void run() {
	        	 MySingleTon s = MySingleTon.getInstance();
	                s.work();
	         }
	    }).start();
	}
}
