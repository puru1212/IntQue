package StringQue;

public class FirstCapLetterInString {

	public static void main(String[] args) {

		
		String str =  "purushottam           madhukarrao dhadwe married to monu     from amravati";
		
		String st = str.replaceAll("\\s+", " ").trim();
		
		String words [] = st.split(" ");
		

	
		for(String wd : words) {
			System.out.print(wd.substring(0, 1).toUpperCase() + wd.substring(1, wd.length()) + " ");
		}
	
		
	}

}
