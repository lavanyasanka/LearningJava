package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\hello.txt");
			int ch = fis.read();
			
			System.out.println(fis.available());
			
			
			while(ch != -1){ // EOF
				System.out.print((char)ch);
				ch = fis.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
