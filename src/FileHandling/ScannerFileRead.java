package FileHandling;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class ScannerFileRead {

	public static void main(String[] args) throws IOException {

		File fl = new File("C:\\FileReaderConcept\\file.txt");

		Scanner sc = new Scanner(fl);
		while (sc.hasNext()) {
			String st = sc.next();
			System.out.println(st);
		}
		sc.close();

	}

}
