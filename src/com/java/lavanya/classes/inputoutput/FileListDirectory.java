package inputoutput;

import java.io.File;
import java.io.IOException;

public class FileListDirectory {

	public static void main(String[] args) throws Exception {
		
		String dir= "C:\\Users\\BILLAKL\\javaworkspace";
		File currentDir = new File(dir); // current directory
		displayFilesInDirectory(currentDir);
	}

	public static void displayFilesInDirectory(File dir) throws IOException {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getPath());
				displayFilesInDirectory(file);
			} else {
				System.out.println("     file:" + file.getPath());
			}
		}
	}
}
