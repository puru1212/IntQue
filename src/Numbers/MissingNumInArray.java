package Numbers;

import java.util.Arrays;

public class MissingNumInArray {

	public static void main(String[] args) {

		int num[] = {1,2,3,5,6,7,8};
		
		int sum = 0;
		int sumLong = 0;
		
		for (int i = 0; i<num.length; i++) {
			sum  = sum + num[i];
		}
		System.out.println(sum);
		
		for (int i = 1; i<=8; i++) {
			sumLong  = sumLong + i;
		}
		System.out.println(sumLong);
		
		System.out.println("missing num in array: "+ Arrays.toString(num) + " is : " + (sumLong-sum));
		
	}

}
