package StringQue;

public class AddNumInString {

	public static void main(String[] args) {


		String stro= "ab@11@%44$12";
		
		String st = stro.replaceAll("[^0-9 ]", "");
		System.out.println(st);
//		char num[] = st.toCharArray();
//		int sum = 0;
//		for(char c : num) {
//			if(Character.isDigit(c)){
//				sum = sum + Integer.valueOf(num[c]);
//			}
//		}
//		System.out.println(sum);
		int rem = 0;
		int sum = 0;
		int num = Integer.parseInt(st);
		System.out.println(num);
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum = sum+rem;
		}
		System.out.println(sum);
	
	}

}
