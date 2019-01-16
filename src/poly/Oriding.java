package poly;

public class Oriding {
	
	static class teacher 
	{ 
	    void show() { System.out.println("teacher show()"); } 
	} 
	  
	static class Std extends teacher 
	{ 
	    void show() { System.out.println("Std show()"); } 
	} 
	  
	
	    public static void main(String[] args) 
	    { 
	        teacher obj1 = new teacher(); 
	        obj1.show(); 
	        teacher obj2 = new Std(); 
	        obj2.show(); 
	    } 
	} 
	


