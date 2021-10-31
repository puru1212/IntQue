package Numbers;

public class ReverseNumbers {

	public static void main(String[] args) {

		// input number to be reversed : 1122334455

		int num = 11223344;
		String s = String.valueOf(num);

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		int revNum = Integer.parseInt(rev);

		System.out.println("Origional Number : " + num);
		System.out.println("Reverse Number : " + revNum);

		int rNum = 0;
		
		int rem = 0;
		
		
		
	}
}