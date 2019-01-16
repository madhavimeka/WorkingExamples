package poly;

public class Oloading {
		public int add(int a, int b) {
			int x=a+b;
			return x;
			
		}
		public int add(int a, int b, int c) {
			int x = a+b+c;
			return x;
		}
	
	public static void main (String args[]) {
		Oloading obj = new Oloading();
		int s = obj.add(1,0);
		System.out.println("sum of two integer is "+s);
		int s1 =obj.add(2,4,6);
		System.out.println("sum of three integer is "+s1);
}}


