package Matrix;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("please enter the no of row for both Matrix: ");
		int row = sc.nextInt();
		System.out.print("please enter the no of col for both Matrix: ");
		int col = sc.nextInt();
		
		int Matrix[][] = new int[row][col];
		int Matrix1[][] = new int[row][col];
		int SumMatrix[][] = new int[row][col];
		int diaSumMatrix[][] = new int[row][col];
		int diaSumMatrix1[][] = new int[row][col];
		
		
		
		
		System.out.println("enter the values for first matrix");
		for (int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				Matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("enter the values for second matrix");
		for (int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				Matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix1 is as follows : ");
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(Matrix[i][j]+  " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix2 is as follows : ");
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(Matrix1[i][j]+  " ");
			}
			System.out.println();
		}
		
		System.out.println("Sum of both matrix is : ");
		for (int i = 0; i<row; i++) {
			for (int j =0; j<col; j++) {
				SumMatrix[i][j] = Matrix[i][j]+Matrix1[i][j];
				System.out.print(SumMatrix[i][j] +" ");
						
			}
			System.out.println();
		}
		
		System.out.println("Sum of diagonal for matrix1 : ");
		for (int i = 0; i<row; i++) {
			for (int j =0; j<col; j++) {
				if(i+j == 3-1) {
					System.out.println(diaSumMatrix[i][j] = Matrix[i][j]+Matrix[i][j]);
				}
			}
		}
		
		System.out.println("Sum of diagonal for matrix2 : ");
		for (int i = 0; i<row; i++) {
			for (int j =0; j<col; j++) {
				if(i==j) {
					System.out.println(diaSumMatrix1[i][j] = Matrix1[i][j]+Matrix1[i][j]);
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
