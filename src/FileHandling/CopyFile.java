package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {

		
		File file = new File("C:\\FileReaderConcept\\Annexure -  Verification For1.docx");
		File outPutFile = new File("C:\\FileReaderConcept\\Annexure -  Verification For1-Copy.docx");
		
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;
		
		try {
			fileInput = new FileInputStream(file);
			fileOutput = new FileOutputStream(outPutFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i = 0;
		try {
			while((i = fileInput.read())!=-1) {
				fileOutput.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
