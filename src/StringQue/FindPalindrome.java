package StringQue;

public class FindPalindrome {

	public static void main(String[] args) {

		String str = "12321";
		String rev = "";
		
		System.out.println("check for palindrome string: "+ str);
		
		for (int i = str.length()-1; i>=0; i--) {
			rev= rev+ str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("this is a palindrome string");
		}
		else {
			System.out.println("this is not a palindrome string");
		}

	}

}
