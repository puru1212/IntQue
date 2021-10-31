package Numbers;

public class FindPrimeNumber {
	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// pint prime number till the range
	public static void getPrimeNumbers(int range) {
		
		for (int k = 2; k<=range; k++) {
			if (isPrimeNumber(k))
			System.out.print(k+" ");
		}
		System.out.println();
	}

	public static void main(String arug[]) {

		System.out.println(isPrimeNumber(4));

//		FindPrimeNumber.getPrimeNumbers(8);
		FindPrimeNumber.getPrimeNumbers(15);
//		FindPrimeNumber.getPrimeNumbers(17);
//		FindPrimeNumber.getPrimeNumbers(25);
//		FindPrimeNumber.getPrimeNumbers(30);
//		FindPrimeNumber.getPrimeNumbers(35);
//		FindPrimeNumber.getPrimeNumbers(40);
//		FindPrimeNumber.getPrimeNumbers(45);
		

		
		
		

	}

}
