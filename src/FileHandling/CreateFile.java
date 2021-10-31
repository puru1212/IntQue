package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		File file = new File("C:\\FileReaderConcept\\Puru.pdf");
		
		try {
			boolean flag = file.createNewFile();
			if(flag==true) {
				System.out.println("File is created at given location");
			}else {
				System.out.println("File is already present at given location");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
