package Numbers;



public class TrickeyProgram {

	public static void test() {
		int x, y;
	}
	public static void main(String[] args) {

		TrickeyProgram bk = new TrickeyProgram();
//		System.out.println(bk.x +""+bk.y);

		System.out.println("-----------------------------------------");

		for (int index = 0; true; index++) {
			System.out.println("Welcome");
			break;
		}
		System.out.println("------------------Coforge-----------------------");
		String s1 = new String("Coforge");
		String s2 = "Coforge";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // == operator is comparing references
		// In simple words, == checks if both objects point to the same memory location
		System.out.println(s1.equals(s2)); // .equals method is comparing content
		System.out.println(s1.concat(s2));
	
		System.out.println("***************OnlineAptitude**************");
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = "Hello";
		String s6 = "Hello";

		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4)); // true
		System.out.println(s3 == s5); // false
		System.out.println(s3.equals(s5)); // true
		System.out.println(s5 == s6); // true
		System.out.println(s5.equals(s6)); //true
		
		System.out.println("***********Thread Concept******************");
		Thread t1 = new Thread("java");
        Thread t2 = new Thread();
        Thread t3 = t1;
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t1 == t3);
        System.out.println(t1.equals(t3));
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
		
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
