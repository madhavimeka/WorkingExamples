package array;

import java.util.Scanner;

public class RevNo {
	public static void main (String args[]) {
		int num=0, revNo=0;
		System.out.println("Enter the number to reverse");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for (;num!=0;) {
			revNo=revNo*10;
			revNo=revNo+num%10;
			num=num/10;
		}
		System.out.println(revNo);
	}
	

}
