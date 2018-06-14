package singleton;



/*
  What is singleton ?
•	We can make constructor as private. So that We can not create an object outside of the class.
•	This property is useful to create singleton class in java.
•	Singleton pattern helps us to keep only one instance of a class at any time.
•	The purpose of singleton is to control object creation by keeping private constructor.

 * 
 */
public 	class MySingleTon{
		
		private static MySingleTon mySingleTon=null;
		/**
	     * Create private constructor
	     */
		private MySingleTon (){
			
		}
		 /**
	     * Create a static method to get instance.
	     */
		public static MySingleTon getInstance()
		{
			if(null==mySingleTon)
			{
				synchronized (MySingleTon.class) {
					if(null==mySingleTon){
						mySingleTon=new MySingleTon();
						System.out.print("Singleton object is creating");
					}
				}
			}
			return mySingleTon;
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