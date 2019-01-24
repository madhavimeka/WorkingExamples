package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set; 


public class HMap {
	    public static void main(String[] args) 
	    {
	    	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	    	        
	    	        map.put("sonu", 01);
	    	        map.put("rushi", 06);
	    	        map.put("anshi", 03);
	    	        map.put("rashmi", 04);
   		
	    	        System.out.println("Size Of The Map : "+map.size());
	    	        
    	        
	    	        System.out.println("The elements are :");
	    	        
	    	        Set set = map.keySet();
	    	        Iterator keySetIterator = set.iterator();
	    	        
	    	        while (keySetIterator.hasNext()) 
	    	        {
	    	            Object key = keySetIterator.next();
	    	            
	    	            System.out.println(key+"  : "+map.get(key));
	    	        }
	    	        
//displaying based on key and value
	    	        System.out.println("Does this map has Sonu as key? "+map.containsKey("sonu")); 	    
	    	        System.out.println("Does this map has 01 as value? "+map.containsValue(01)); 
// remove    
	    	        System.out.println("Value removed from the map : "+map.remove("03"));
	    	    }    
	    	}
	    

	
 
	


