package Numbers;

public class ReverseNumWithoutString {

	
	public void reverseNumber(int OrigionalNum) {
		
		int origNum = OrigionalNum;
		int ReverseNum = 1;
		int rem = 0;
		
		while(OrigionalNum>0) {
			rem = OrigionalNum % 10;
			OrigionalNum = OrigionalNum/10;
			
			ReverseNum = (ReverseNum*10) + rem;
		}
		
		System.out.println("Origional Number is : "+ origNum);
		System.out.println("Origional Number is : "+ ReverseNum);
		
		
	}
	
	
	
	public static void main(String arug[]) {
		
		
		ReverseNumWithoutString rnum = new ReverseNumWithoutString();
		
		rnum.reverseNumber(12345);
		
		int num = 34567890;
		String str= String.valueOf(num);
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(num);
		System.out.println(sb.reverse());
		
	}
	
}
