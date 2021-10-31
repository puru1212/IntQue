package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//12,30,45,76,8

public class MaxNumber {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(12, 30, 45, 76, 8));

//		ls.add(12);
//		ls.add(30);
//		ls.add(45);
//		ls.add(76);
//		ls.add(8);

		System.out.println(ls.size());

		System.out.println("-------------------------------");
		Collections.sort(ls);
		System.out.println(ls.get(ls.size() - 2));
		System.out.println("-------------------------------");

		Integer max = Collections.max(ls);
		Integer min = Collections.min(ls);
		System.out.println("ArrayList values : " + ls);
		System.out.println("ArrayList max value : " + max);
		System.out.println("ArrayList max value : " + min);
		
		/*
		 * Collections Approach
		 */
		
		System.out.println("-------------------------------");
		
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(-20, 34, 21, -87, 92,10, 1, 100, 8));
		Collections.sort(lst);

		System.out.println("Largest num is : "+ Collections.max(lst));
		System.out.println("Smallest num is : " +Collections.min(lst));
		System.out.println("Given lsit of num is : "+ lst);
		System.out.println("Fourth highest num is : "+ (lst.get(lst.size()-4)));
		

		System.out.println("-------------------------------");
		/*
		 * Second Approach for second highest number in array
		 */

		int ar[] = new int[] { -20, 34, 21, -87, 92, 10, 1, 100, 8 };

		Arrays.sort(ar);
		System.out.println("Given array is : " + Arrays.toString(ar));
		System.out.println("Total length of Array is : " + ar.length);

		System.out.println("Largest num is : " + ar[ar.length - 1]);
		System.out.println("SecondLargest num is : " + ar[ar.length - 2]);
		System.out.println("ThirdLargest num is : " + ar[ar.length - 4]);
		System.out.println("FourthLargest num is : " + ar[ar.length - 5]);

		System.out.println("Smallest num is : " + (ar[0]));

	}

}
