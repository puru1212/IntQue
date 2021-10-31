package print;


import java.util.Scanner;

public class Print {

	public static void main(String[] args) {

		
		
		Scanner ip = new Scanner(System.in);
//		System.out.print("Input your first Name: ");
//		String fname = ip.next();
//		System.out.print("Input your last Name: ");
//		String lname = ip.next();
//		System.out.println();
//		
//		System.out.println("Hello\n"+fname+" "+ lname);
		
		
//		System.out.print("Enter full name: ");
//		String fullName = ip.nextLine();
//		System.out.print("Enter Address : ");
//		String address = ip.nextLine();
//		
//		System.out.println("Hello\n"+ fullName+"\n"+"Living at : "+address);
		
		
//		System.out.print("Enter first number: ");
//		int fnum = ip.nextInt();
//		System.out.print("Enter second number: ");
//		int snum = ip.nextInt();
//		
//		System.out.println("Sum of "+ fnum+" and "+snum+" is = "+(fnum+snum));
		
		System.out.print("Insert the number to check for even or odd : ");
		int num = ip.nextInt();
				
		if(num%2==0) {
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
		
		
	}

}
