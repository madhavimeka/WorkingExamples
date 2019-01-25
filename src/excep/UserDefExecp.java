package excep;

import java.util.Scanner;

	
	class UDE extends Exception{
		 UDE(){
			super("Odd number Exception:");
		      }
		 UDE(String msg){
				super(msg);
			      }
		     }
	public class UserDefExecp {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		no= Integer.parseInt(sc.nextLine());
		try {
			if (no%2 !=0) 
			 throw (new UDE());
			else
				System.out.println("\t"+ no +"is an Even Number");
		}
		catch(UDE ex) {
			System.out.println(ex.getMessage());
		}
			
		}
		

	}


