package print;

public class test {

	public static void main(String arug[]) {

		for (int i = 0; i <= 3; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
