package StringQue;

public class FineNumberOfBlankSpace {

	
	public static void findBlankSpace(String str) {
		
		System.out.println("Gettimg blank space count for : "+ str);
		
		int count = 0;
		
		for (int i = 0; i<=str.length()-1; i++) {
			char st = str.charAt(i);
			if(st==' ') {
				count++;
			}
		}
		System.out.println("Blank space count in the string is : "+ count);
	}
	
	
	
	public static void main(String[] args) {

		
		findBlankSpace("AB CD E FGH JH      JKJKJK     UI");
		
			
	}

}
