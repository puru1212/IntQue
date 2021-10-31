package Matrix;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of rows: ");
		int row = sc.nextInt();
		
		System.out.print("Enter the no of cols: ");
		int col = sc.nextInt();
		
		int data[][] = new int [row][col];
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print("Enter the value for ["+i+"]["+j+"] : ");
				data[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix is : ");
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
		int sumTop = 0;
		int sumLow = 0;
		for(int i =0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i==j) {
					sumTop = sumTop + data[i][j];
				}
				if(i+j ==3-1) {
					sumLow = sumLow + data[i][j];
				}
			}
		}
		System.out.println("Addition of Top Diagobal is : "+ sumTop);
		System.out.println("Addition of Low Diagobal is : "+ sumLow);
		
		
		
		
	}

}
