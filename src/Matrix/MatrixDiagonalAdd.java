package Matrix;

import java.util.Scanner;

public class MatrixDiagonalAdd {
	
//		1 2 3 
//		4 5 6 
//		7 8 9 

	public static void main(String[] args) {
		int a[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);
		for (int i =0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.println("Enter the matrix element for pocket ["+i+"]["+j+"]");
				a[i][j] = sc.nextInt();
			}
		}
		
//		a[0][0] = 8;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 4;
//		a[1][1] = 10;
//		a[1][2] = 6;
//		a[2][0] = 7;
//		a[2][1] = 8;
//		a[2][2] = 14;

		System.out.println("Matrix is : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of diagonl is : ");
		int sumTop = 0;
		int sumLow = 0;
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if(i==j) {
					sumTop= sumTop+ a[i][j];
				}
				if(i+j==3-1) {
					sumLow = sumLow + a[i][j];
				}
			}
		}
		System.out.println("Sum of Top to low diagonal is : " + sumTop);
		System.out.println("Sum of Low to topdiagonal is : " + sumLow);

	}

}
