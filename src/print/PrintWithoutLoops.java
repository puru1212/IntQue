package print;

public class PrintWithoutLoops {

//	print 1 to 100 without any loop.
//	1. recursive method
	
	
	
	public static void main(String[] args) {
		
		//printNum(0);
		printNumber(5, 50);

	}

	
	public static void printNum(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	
	public static void printNumber (int stNum, int edNum) {
		
		if (stNum<=edNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, edNum);
			
		}
	}
	
	
}
