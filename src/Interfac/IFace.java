package Interfac;
	import java.io.*; 
	public class IFace{  
	interface in1 
		{ 
	    int a = 10, b=20;
	  
	    void add(); 
		} 
	static class samp implements in1 
		{ 
	    public void add() 
	    	{ 
	    	int sum=a+b;
	        System.out.println("Sum:"+sum); 
	    	} 
	  
	    public static void main (String[] args) 
	    	{ 
	        samp t = new samp(); 
	        t.add(); 
	    	} 
	} 
	}

