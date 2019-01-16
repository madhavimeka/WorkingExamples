package poly;


public class calOride {
	static class parent 
	{ 
	 public void calculate(int a,int b) { 
	    	int mul;
	    	mul = a*b;
	      	System.out.println("multiplication : "+ mul); } 
	} 
	  
	static class child extends parent 
	{ 
		 public void calculate(int a,int b) { 

			 super.calculate(a, b);
	} 
	  
	
	    public static void main(String[] args) 
	    { 
	        child obj = new child(); 
	        obj.calculate(10,23); 
	       
	    } 


}}
