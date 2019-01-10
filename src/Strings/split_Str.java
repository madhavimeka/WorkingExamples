package Strings;

import java.util.Arrays;

public class split_Str {
		
	    public static void main (String[] args)
	    {
	        String str = "welcome to java strings";
	         
	        String[] strArray = str.split("\\s");
	         
	        System.out.println(Arrays.toString(strArray));
	    }
	

}
