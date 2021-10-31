package StringQue;

public class RotatibleString {

	
	public static boolean isRotatible(String one, String two) {
		
		boolean flag = true;
		if ( one==null || two == null || one.length()!=two.length()) {
			flag = false;
			return flag;
		}else {
			String conCat = one+one;
			flag = conCat.contains(two);
		}
		return flag;
	}
	
	public static void main(String[] args) {

		String one = "purushottam";
		String two = "shottampuru";
		String three = null;
		String four = null;
		String five = "asasasas";
		
		System.out.println(isRotatible(one, two));
		System.out.println(isRotatible(one, three));
		System.out.println(isRotatible(one, four));
		System.out.println(isRotatible(one, five));
	}
}
