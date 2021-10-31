package Numbers;

//import java.util.Scanner;

public class FindFactorialNumber {

	//4=4*3*2*1
	public static void main(String arug[]) {
		
		//System.out.println("Enter the number to calculate the Factorial :");
		//Scanner sc = new Scanner(System.in);
		
		int num =  4; //sc.nextInt();
		int fact = 1;
		for (int i = num; i>=1; i--) {
			fact = fact*i ;
		}
		System.out.println(fact);
	}
}
