package Collections;

import java.util.*;


public class Hset {
	  
	    public static void main(String[]args) 
	    { 
	        HashSet<String> N = new HashSet<String>(); 
	  
	        N.add("sonu"); 
	        N.add("rushi"); 
	        N.add("anshi");
	  
	        System.out.println(N); 
	        System.out.println("Names : " +  N.contains("sonu")); 
	  
	     
	        N.remove("rushi"); 
	        System.out.println("After removing rushi"+N); 
	  
	        System.out.println("Iterating the list"); 
	        Iterator<String> M = N.iterator(); 
	        while (M.hasNext()) 
	            System.out.println(M.next()); 
	    } 
	} 



