package FileHandling;

import java.io.File;
import java.io.FileReader;

public class BufferedFileReader {

	public static void main(String[] args) {

		String path = "C:\\FileReaderConcept\\file.txt";
		File file = new File(path);
		try {
			FileReader fr = new FileReader(file);
			java.io.BufferedReader br = new java.io.BufferedReader(fr);

			String str;
//			String st = "Welcome to Java"; 
			while ((str = br.readLine()) != null) {
				System.out.println(str);

//				murli logic
//				if(str.equals(some string to compare)) {
//					System.out.println(str);

			}
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
