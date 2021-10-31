package StringQue;

public class WithoutRepalceStringProgram {

	public static void main(String[] args) {

		String str = "FName=Isaac|LName=Newton|Address=UK|Age=10|School=Trinity|Invention=LawsOfMotion";
				
		/*
		 *Read above as a string and write the program using collection framework classes to 
		 *print values as mentioned below. Do not use replace method of String. 
		 *
		 *Output:
				FName : Issac
				LName : Newton
				Address : UK
				And so on….
		 */
			
//		String s = str.replace("=", " : ");
//		String s1 = s.replace("|", "\n");
//		System.out.println(s1);
		
		
//		String nStr = str.replaceAll("\\|", " ");
//		String words[] = nStr.split(" ");
//		
//		for(String w : words) {
//			System.out.println(w.replace("=", " : "));
//		}
	
		
		String st = "";
		char ch[] = str.toCharArray();
		for(char c : ch) {
			if(c=='=') {
				st = st+ " : ";
			}else if(c=='|'){
				st = st+'\n';
			}else {
				st = st+c;
			}
		}
		System.out.println(st);
		
		
		
		
		
		
	}

}
