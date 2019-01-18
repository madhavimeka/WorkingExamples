package excep;

public class arthExecp {
	public static void main (String args[]) {
		try {
			int a =2, b=0;
			int div = a/b;
			System.out.println("result:" + div);
			
		}
		catch(ArithmeticException a) {
			System.out.println("Exception: number not divisible by 0");
		}
	}

}
