package StringQue;

import java.util.HashMap;
import java.util.Map;

public class GSLabs {

	public static boolean compareString(String name1, String name2) {

		if (name1 == null || name2 == null && name1.length() != name2.length()) {

			return false;
		}
		boolean flag = true;

		char c1[] = name1.toCharArray();
		StringBuilder sb = new StringBuilder(name2);

		for (char c : c1) {
			Integer index = sb.indexOf("" + c);
			if (index != 1) {
				sb.deleteCharAt(index);
				flag = true;
			} 
		}
		return flag;
	}

	
	
	public static void getFiboNum(int num) {
		
		
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.print(n1+ " "+n2);
		
		for(int i = 0; i<=num; i++) {
			sum = n1 + n2;
			System.out.print(" "+sum);
			n1 = n2;
			n2 = sum;
		}
		
	}
	
	
	public static void printTest(String name) {
		
		for(;;) {
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args) {
		

//		printTest("a");
//		getFiboNum(5);

		String str = "abcd";
		String str1 = "abcd";
		String str2 = "bcad";
		String str3 = "rushottampu";

		System.out.println(compareString(str1, str1));

//		char ch[] = str.toCharArray();
//		
//		Map<Character, Integer> store = new HashMap<Character, Integer>();
//		
//		for( char c : ch) {
//			Integer count = store.get(c);
//			if(count==null) {
//				store.put(c, 1);
//			}else{
//				store.put(c, ++count);
//			}
//		}
//		
//		store.forEach((k,v)->System.out.println(k +" : "+v));
//		
//		

	}

}
