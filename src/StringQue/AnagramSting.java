package StringQue;

public class AnagramSting {

	public static boolean isAnagram(String s1, String s2) {

		String s3 = s1.replaceAll("\\s", "").toLowerCase();
		String s4 = s2.replaceAll("\\s", "").toLowerCase();

		boolean flag = true;
		if (s3.length() != s4.length()) {
			flag = false;
			return flag;
		} else {
			char ch[] = s3.toCharArray();
			 StringBuilder sb = new StringBuilder(s4);
			for (char c : ch) {
				int index = sb.indexOf("" + c);
				if (index != -1) {
					sb.deleteCharAt(index);
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println(isAnagram("mam", "amm"));
		System.out.println(isAnagram("sin", "silendsdsdsdt"));
		System.out.println(isAnagram("triangle", "integral"));
		System.out.println(isAnagram("tac", "cat"));
	}

}
