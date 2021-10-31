package Numbers;

public class Swap2Numbers {

	public static void main(String[] args) {

		int a = 23, b = 71;

		System.out.println("Before Swapping the two numbers:" + a + " " + b);

		//1. Logic -- third variable
		// whenever we write a = b the value of b will be assigned to a
		
//		int t = a;
//		a=b;
//		b=t;

		
		//2.  logic -- with + and - operator without Third operator
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		//3. with * and / operator without Third operator
		
		
//		a = a*b;
//		b = a/b;
//		a = a/b;
		
		//4. Using bitwise XOR (^)
		
//		a = a^b;
//		b = a^b;
//		a = a^b;
		
		//5. single statement
		
//		b = a+b-(a=b);
		
		
		System.out.println("After Swapping the two numbera:" + a + " " + b);

	}

}
