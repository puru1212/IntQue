package StringQue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateWord {

	public static void main(String[] args) {

		String str = "java java programming language programming language";
		System.out.println(str);

		String names[] = str.split(" ");

		Map<String, Integer> store = new HashMap<String, Integer>();

		for (String sp : names) {
			Integer count = store.get(sp);

			if (count == null) {
				store.put(sp, 1);
			} else {
				store.put(sp, ++count);
			}

		}

		System.out.println(store);

		Set<Entry<String, Integer>> entrySt = store.entrySet();

		for (Entry<String, Integer> entry : entrySt) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate word is : " + entry.getKey());
			}
		}

		System.out.println("**********************************************");

		Set<String> hs = new HashSet<String>();

		for (String sp1 : names) {
			if (hs.add(sp1) == false) {
				System.out.println("duplicate word is : " + sp1);
			}
		}

		System.out.println("***********************************************");

		System.out.println(names.length);
		for (int i = 0; i <= names.length-1; i++) {
			for (int j = i + 1; j <= names.length-1; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("duplicate word is : " + names[i]);
				}
			}
		}

	}

}
