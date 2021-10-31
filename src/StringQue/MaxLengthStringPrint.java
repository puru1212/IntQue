package StringQue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxLengthStringPrint {
	
	
	public static void main(String[] args) {

		String str = "java c c# python php ruby perl";
		
		String words[] = str.split(" ");
		Map<String, Integer> store =  new HashMap<String, Integer>();
		for(String w : words) {
			store.put(w, w.length());
		}

		int maxValue = Collections.max(store.values());
		int minValue = Collections.min(store.values());
		
		Set<Entry<String, Integer>> etr = store.entrySet();

		for(Entry <String, Integer> e : etr) {
			if(e.getValue()==maxValue) {
				System.out.println("String with max length is : " + e.getKey()+"::" +e.getValue());
			}else if(e.getValue()==minValue) {
				System.out.println("String with min length is : " + e.getKey()+"::" +e.getValue());
			}
		}
		
		

	}
}
