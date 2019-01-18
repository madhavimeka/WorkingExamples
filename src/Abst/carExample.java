package Abst;
	abstract class car  
	{ 
	    String name; 
	      
	    abstract  void fuel();
	      
	    public car(String name) { 
	        System.out.println("car constructor called"); 
	        this.name = name; 
	    } 
	      
	    public String getName() { 
	        return name; 
	    } 
	} 
	class maruti extends car
	{ 
	      
	    public maruti(String name) { 
	  
	        super(name); 
	        System.out.println("maruti constructor called"); 
	    } 

		void fuel() {
			System.out.println("Maruti fuel method called");
		} 
	      
	} 
	class Tata extends car{ 
	 Tata(String name) {
			super(name);
		}

	@Override
	void fuel() {
System.out.println("Tata fuel method");		
	}



	    } 
	public class carExample  
	{ 
	    public static void main(String[] args) 
	    { 
	        maruti s1 = new maruti("baleno"); 
	        Tata s2 = new Tata("xxx"); 
	          s1.fuel();
	          s2.fuel();
	    } 
	} 
	   


