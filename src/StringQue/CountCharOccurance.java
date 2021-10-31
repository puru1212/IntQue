package StringQue;

public class CountCharOccurance {

	public static void main(String[] args) {

		String str = "i love java coading and i practice it daily";

		getOccurace(str, 'i');
		getCharCount(str, ' ');

	}

	public static void getCharCount(String str, char val) {

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == val) {
				count++;
			}
		}

		System.out.println("Given character : " + val + " : is reapeated " + count + " times");

	}

	public static void getOccurace(String str, char val) {
		int count = 0;

		for (char e : str.toCharArray()) {

			if (e == val) {
				count++;
			}
		}
		System.out.println("Given character : " + val + " : is reapeated " + count + " times");

	}

}
