package hashmap;

import java.util.*;

public class Hasmap_Iterator {
	
	public static void main(String args[]) {
		  	
		  HashMap hm = new HashMap();
	      
	      hm.put("A","1");
	      hm.put("C","3");	      
	      hm.put("B","2");
	      hm.put("B","3");
	      
	      	hm.put(null,"Ramesh");
			
			hm.put("null","jack");
			
			hm.put("","testempty");

	  	    System.out.println("==>"+hm.get("null"));

	  	    System.out.println("==>"+hm.get(null));

	  	    System.out.println("==>"+hm.get(""));

	  	    System.out.println("==>"+hm.get("noexistkey"));
	  	    
		    System.out.println("===== Another way set =============");

	      Iterator itr=hm.entrySet().iterator();
	      
	      while(itr.hasNext()){
	    	  
	    	  Map.Entry m=(Map.Entry) itr.next();
	    	  
	    	  System.out.println("==>"+m.getKey() +","+m.getValue());
	    	  
	      }
	      
	      System.out.println("===== Another way set =============");
	      
	      Set sets=hm.entrySet();
	      
	      Iterator itr1=sets.iterator();
	      
	      while(itr1.hasNext()){
	    	  
	    	  Map.Entry m=(Map.Entry) itr1.next();
	    	  
	    	  System.out.println("==>"+m.getKey() +","+m.getValue());
	    	
	    	 // System.out.println("==>"+m);
	      }
	      
	      System.out.println("===== Another way =============");
	      
	      Set<String> keysetss=hm.keySet();
	      
	      for(String s:keysetss)
	    	  System.out.println("==>"+hm.get(s));
	}
	    	  	    
}

