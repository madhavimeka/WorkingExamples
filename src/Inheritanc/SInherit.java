package Inheritanc;

public class SInherit {

	public static void main(String[] args) {
		student t = new student();
		t.sub();
		t.std();
		
	}
}

 class teacher {
	 void sub() {
		 System.out.println("Ds");
	 }
	
}
 class student extends teacher{
	 void std() {
		 System.out.println("Student class");
	 }
	 
 }