package objects;


public class Driver{
	
	public static void main(String []args){

		System.out.println("Execution from Main.");
		Vehicle v = new Volvo();
		Vehicle v1 =new Red();
//In vehicle class these two methods are present
		v.vehicleBreak();
		v.engine();
		v1.engine();

	}
}