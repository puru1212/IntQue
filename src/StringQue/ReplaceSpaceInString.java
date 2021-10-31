package StringQue;

public class ReplaceSpaceInString {

	public static void main(String[] args) {


		String str = "Purushottam Madhukarrao Dhadwe";
		String str1 = "Monika Purushottam Dhadwe";
		
		System.out.println(str.replaceAll(" ", "-"));
		
		System.out.println(str1.replaceAll(" ", "_"));
		
		System.out.println(str.replace("Purushottam Madhukarra", "Monika"));
		
		
		
		
		String name = "Monika Purushottam Dhadwe";
		System.out.println(name.replaceAll(" ", "-"));
				
	}

}
