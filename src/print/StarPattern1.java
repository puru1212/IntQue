package print;

public class StarPattern1 {

	public static void main(String[] args) {
		
//		1st output-------------------------
//		*
//		**
//		***
//		****
//		*****
//		2nd output-------------------------
//		*****
//		****
//		***
//		**
//		*
//		3rd output-------------------------
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

		System.out.println("1st output-------------------------");
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("2nd output-------------------------");
		
		for (int i = 0; i<=4; i++) {
			for (int j = 4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3rd output-------------------------");
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i<=4; i++) {
			for (int j = 4; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
