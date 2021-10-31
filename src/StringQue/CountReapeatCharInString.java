package StringQue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountReapeatCharInString {

	public static void main(String[] args) {

//		String str = "ababcsabcs";
//
//		Map<Character, Integer> store = new HashMap<Character, Integer>();
//		for (int i = 0; i < str.length() - 1; i++) {
//			char charValue = str.charAt(i);
//			if (store.containsKey(charValue)) {
//				store.put(charValue, store.get(charValue) + 1);
//			} else {
//				store.put(charValue, 1);
//			}
////		}
//
//		System.out.println(store);
//
//		Set<Character> ch = store.keySet();
//
//		for (char e : ch) {
//			System.out.println(e + ":" + store.get(e));
//		}

		System.out.println("-------------------------------------");

		String st = "asaaaaaasasdddddfdfdfweewewawfrse";
		char cha[] = st.toCharArray();

		Map<Character, Integer> storeNew = new HashMap<Character, Integer>();
		for (char e : cha) {
			Integer count = storeNew.get(e);
			if (count == null) {
				storeNew.put(e, 1);
			}else{
				storeNew.put(e, ++count);
			}
		}
		System.out.println(storeNew);

	}

}
