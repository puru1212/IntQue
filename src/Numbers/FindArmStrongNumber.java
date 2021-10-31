package Numbers;

public class FindArmStrongNumber {
	
	public void isArmStrongNumber(int num) {
		
		//153
		int rem = 0;
		int sum = 0;
		int t = num;
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum = sum+(rem*rem*rem);
		}
		if(t==sum) {
			System.out.println("this is a Armstrong Number");
		}
		else {
			System.out.println("this is not a Armstrong Number");
		}
	}
	
	
	
	
	public static void main(String[] args) {

		FindArmStrongNumber input = new FindArmStrongNumber();
		
		input.isArmStrongNumber(153);
		
		
		
		

	}

}
