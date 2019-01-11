package Inheritanc;

public class inheritSuper {
	 public static void main(String args[]) 
	    { 
	        Child s = new Child(); 
	  	        s.display(); 
	    } }
	class Parent
	{ 
	    void Pmsg() 
	    { 
	        System.out.println("This is Parent Class"); 
	    } 
	} 
	  
	class Child extends Parent 
	{ 
	    void Cmsg() 
	    { 
	        System.out.println("This is a Child class"); 
	    } 
	  
	    void display() 
	    { 
	  	    Cmsg();
	    	super.Pmsg(); 
	    } 
	}
	  
	



