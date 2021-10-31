package print;

public class AlphabetPattern {

	public static void main(String[] args) {

//		a 
//		a b 
//		a b c 
//		a b c d 
//		a b c d e 
//		a b c d e f 
//		a b c d e f g 
//		a b c d e f g h 
		
//		00 01 02 03 04 05 06 07 08 09 
//		10 11 12 13 14 15 16 17 18 19 
//		20 21 22 23 24 25 26 27 28 29 
//		30 31 32 33 34 35 36 37 38 39 
		
		
		int alpha = 65;
		//int alpha = 97;
		
		for (int i = 0; i<=7; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j+ " ");
			}
			System.out.println();
		}
	}

}
