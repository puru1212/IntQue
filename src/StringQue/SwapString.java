package StringQue;

public class SwapString {

	public static void main(String[] args) {


		String a = "Hello_Java";
		String b = "World";
		
		System.out.println("Before swap value of a is : "+ a);
		System.out.println("Before swap value of b is : "+ b);
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After swap value of a is : "+ a);
		System.out.println("After swap value of b is : "+ b);
		
		
		
		
		
		
		
	}

}
