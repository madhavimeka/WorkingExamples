package array;

import java.util.Scanner;

public class print2D_array {
	public  static void main (String args[]) {
        int row, col;
        int arr[][];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        row = scanner.nextInt();
        System.out.print("Enter the no of columns : ");
        col = scanner.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("elements in an array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
		
	}


