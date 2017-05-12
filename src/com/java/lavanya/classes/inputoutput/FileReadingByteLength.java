package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingByteLength {

	public static void main(String[] args) {

		FileInputStream fis = null;
		int i = 0;
		char c;
		byte [] bs = new byte [20];
		try {
			fis = new FileInputStream ("C:\\hello.txt");
			//i = fis.read(bs);
			
			i= fis.read(bs,14, 4);
			System.out.println("Number of bytes read: "+i);
			System.out.print("data read: ");
			for(byte b:bs) {
				c = (char)b;
				if(b==0)
					c= '*';
				System.out.print(c);
			}  
		} catch(Exception ex) {
     		ex.printStackTrace();
		}
		finally{
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}
}
