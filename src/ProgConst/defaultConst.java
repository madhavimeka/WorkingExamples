package ProgConst;


public class defaultConst 
{ 
    int No; 
    String name="nisum"; 
    defaultConst() {
    	System.out.println("default method");
	}
  
  
static class def
{ 
    public static void main (String[] args) 
    { 
    	defaultConst m = new defaultConst(); 
        System.out.println(m.name); 
        System.out.println(m.No); 
        
    } 
} 
}