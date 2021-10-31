 package StringQue;

public class ReverseString {

	public static void main(String[] args) {

		
		String name = "PurushottamMadhukarraoDhadwe";
		String rev = "";
		System.out.println(name.length());
		
		for (int i = name.length()-1; i>=0;i--) {
			rev= rev+name.charAt(i);
			
		}
		System.out.println(name);
		System.out.println(rev);
		
		
		System.out.println("-------------------------");
		
		StringBuffer sf = new StringBuffer(name);
		
		System.out.println(sf.reverse());
		
		
	}

}
