package StringQue;

public class Test {

	
	public static void main(String[] args) {
		
		
		
		String st = "1sc2A4a#$sd5sd89D8sEd2%2";
		
		String sp = st.replaceAll("[a-z A-Z #$%]", "");
		System.out.println(sp);
		
		int num = Integer.parseInt(sp);
		int rem = 0;
		int sum = 0;
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum = sum+rem;
		}
		System.out.println(sum);
		
		
		

	}

}
