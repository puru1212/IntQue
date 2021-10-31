package StringQue;

public class RotatedString {

	public static boolean verifyString(String st1, String st2) {
		
		boolean flag = true;
		String strCat = st1+st1;
		
		if(st1==null || st2==null || st1.length()!=st1.length()) {
			flag = false;
		}else if(!strCat.contains(st2)) {
			flag = false;
		}else {
			char ch[] = st1.toCharArray();
			StringBuilder sb = new StringBuilder(st2);
			for(char c : ch) {
				Integer index = sb.indexOf(""+c);
				if(index!=-1) {
					sb.deleteCharAt(index);
				}else {
					flag = false;
				}
			}
		}
		return flag;
		
		
	}
	
	public static void main(String[] args) {
		
		
		String str1 = "abcd";
		String str2 = "bdca";
		
		System.out.println(verifyString(str1, str2));
		
		
		
	}

}
