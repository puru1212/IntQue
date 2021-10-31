package Matrix;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the no of row for matrix1: ");
		int row = sc.nextInt();
		System.out.print("Enter the no of col for matrix1: ");
		int col = sc.nextInt();
		int matrix1[][] = new int [row][col]; 
		int matrix2[][] = new int [row][col]; 
		int addMatrix[][] = new int [row][col]; 
		
		System.out.println("Enter the value for Matrix1: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the value for Matrix2: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Matrix1 is as below: ");
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(matrix1[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix2 is as below: ");
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(matrix2[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		System.out.println("Addition of 2 matrix are : ");
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(addMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
