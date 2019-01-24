package programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class OccOfChar {

	    public static int upperCase = 0;
	    public static int lowerCase = 0;
	    public static int numberCount = 0;
	    public static int specialCharCount = 0;

	    public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter the string: ");
	        for (char c : dataIn.readLine().toCharArray()) {
	            if (Character.isUpperCase(c)){ upperCase++; }
	            else if (Character.isLowerCase(c)){ lowerCase++; }
	            else if (Character.isDigit(c)){ numberCount++;}
	            else { specialCharCount++; }
	        }
	        System.out.printf(" contains %d uppercases, %d lowercases, %d digits and %d special characters.\n\n", upperCase, lowerCase, numberCount,
	                specialCharCount);
	    }
	}


