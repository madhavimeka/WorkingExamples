package objects;

public class OwnTcast {
	
	    static float methodOne(int i)
	    {
	        long j = i;     
	        return j;       
	    }
	    public static void main(String[] args)
	    {
	        byte b = 10;
	        short s = b;      
	        double d = methodOne(s);  
	        System.out.println(d);
	    }
	}


