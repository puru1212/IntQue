package StringQue;

public class EliminateNumber {

	public static void main(String[] args) {


		String str = "My name %&!! is Purushottam and year of$$$ birth is $$$1988 $$$and month is 9-aug #$";
		
//		String st = str.replaceAll("[^a-z A-z]", "");
//		str.replaceAll("[a-b A-B 0-9]", "");
		
		String st = str.replaceAll("[^0-9]", "");
		System.out.println(st);
		
		int num = Integer.parseInt(st);
		int rem;
		int sum=0;
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum = sum + rem;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
