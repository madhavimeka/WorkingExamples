package poly;
class Bank{ 
int getRateOfInterest(){return 0;} 
} 
 
class SBI extends Bank{ 
int getRateOfInterest(){
	int interest = 8;
	return interest;} 
} 
 
class ICICI extends Bank{ 
	int getRateOfInterest(){
		int interest = 10;
		return interest;} 
} 
class AXIS extends Bank{ 
	int getRateOfInterest(){
		int interest = 12;
		return interest;} 
} 
 
public class OPoly{ 
public static void main(String args[]){ 
SBI l=new SBI(); 
ICICI m=new ICICI(); 
AXIS n=new AXIS(); 
System.out.println("SBI Rate of Interest: "+l.getRateOfInterest()); 
System.out.println("ICICI Rate of Interest: "+m.getRateOfInterest()); 
System.out.println("AXIS Rate of Interest: "+n.getRateOfInterest()); 
} }

