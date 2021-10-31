package FileHandling;

import java.io.File;

public class PrintFileAndFolders {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Pdhadwe\\Documents");
		
		File nameList[] =  file.listFiles();
		
		for(File e : nameList) {
			if(e.isDirectory()) {
				System.out.println("Directory : "+ e.getName());
			}else if(e.isFile()) {
				System.out.println("File : "+ e.getName());
			}
		}
	}
}
