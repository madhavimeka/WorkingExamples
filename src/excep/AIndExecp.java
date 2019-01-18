package excep;

public class AIndExecp {
	public static void main (String args[]) {
		try {
		int a[] = new int [5];
		a[5]=9;
		System.out.println(a[1]);
	}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Index is out of bounds");
		}
	}
}
