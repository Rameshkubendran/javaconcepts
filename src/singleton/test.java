package singleton;

public class test {
	private static test singleton=null;
	
	/*private test (){
		
	}*/
	
	public static test getInstance1sss()
	{
		if(null==singleton)
		{
			synchronized (MySingleTon.class) {
				if(null==singleton){
					singleton=new test();
					System.out.print(" Creating singleton object is creating");
				}
			}
		}
		return singleton;
	}
	public void msg(){
		System.out.print("\n welcome......");
	}
	
	public void work(){
        for(int i=0; i<2; i++){
        	System.out.print("\n-----multi------");
        }
}
}
