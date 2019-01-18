package programs;
import java.util.Scanner;


public class removeSpace {
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter String");       
	        String iString = sc.nextLine(); 
	        
	        char[] charArray = iString.toCharArray();        
	        String stringWithoutSpaces = "";
	        
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
	            {
	                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
	            }
	        }
	        
	        System.out.println("Enter String : "+iString);
	        System.out.println("String Without Spaces : "+stringWithoutSpaces);
	        
	        sc.close();
	    }
	}


