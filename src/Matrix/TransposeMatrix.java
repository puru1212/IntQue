package Matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of row for Matrix : ");
		int row = sc.nextInt();
		System.out.print("Enter the no of col for Matrix : ");
		int col = sc.nextInt();

		int matrix[][] = new int[row][col];
		int transpose[][] = new int[col][row];

		System.out.println("Enter the value for Marix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Marix is as follows");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Creation of Transpose Marix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("The Transpose Marix is as follows");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}

}
