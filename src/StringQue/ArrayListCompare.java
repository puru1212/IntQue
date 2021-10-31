package StringQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("11", "12", "47", "58", "76", "10"));
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("12", "11", "47", "58", "76", "10"));
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("11", "12", "58", "47", "76", "10"));

		Collections.sort(ar1);
		Collections.sort(ar2);

		System.out.println(ar1.equals(ar2)); // true
		System.out.println(ar2.equals(ar3)); // false
		
		
		ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "G"));
		
		
		ar5.removeAll(ar4); //G ... it removes common values of both list and gives unique value of first list 
		System.out.println(ar5);
		System.out.println(ar4);

		
		ar4.removeAll(ar5); //F
		System.out.println(ar4);
		
		ArrayList<String> ar6 = new ArrayList<String>(Arrays.asList("java", "c", "c#", "ruby", "python", "js"));
		ArrayList<String> ar7 = new ArrayList<String>(Arrays.asList("java", "c", "c#", "ruby", "perl", "php"));
		
		ar7.retainAll(ar6); //[java, c, c#, ruby] .... it retails common value from both list 
		System.out.println(ar7);
		
	}

}
