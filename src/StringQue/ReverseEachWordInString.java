package StringQue;

public class ReverseEachWordInString {

	public static void main(String arug[]) {

		
		String str = "Java is a Programming Language";
		
		String word[] = str.split(" ");
		String revString = "";
		
		//Approach: 1
		for (String w : word) {
			String revWord = "";
			for (int i = w.length()-1; i>=0; i--) {
				revWord = revWord + w.charAt(i);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
		
		//Approach: 2
		
//		for (String e : word) {
//			
//			StringBuffer sb = new StringBuffer(e);
//			sb.reverse();
//			
//			revString = revString + sb.toString() + " ";
//			
//			
//		}
//		System.out.println(revString);
	}
}
