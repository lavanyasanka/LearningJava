package inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputArray {
	public static void main(String[] args) throws Exception {
		FileInputStream inStream = null;
		BufferedInputStream bis = null;
		FileOutputStream baos = null; 
		BufferedOutputStream bos = null;

		try {

			inStream = new FileInputStream("c:\\hello.txt");

			bis = new BufferedInputStream(inStream);
			baos = new FileOutputStream("D:\\test.txt");
			bos = new BufferedOutputStream(baos);
			System.out.println("copying started");
			int numByte = bis.available();
			System.out.println("copying numByte" +numByte);
			//int numByte = 1024;
			byte[] buf = new byte[numByte];

			// read byte into buf , starts at offset 2, 3 bytes to read
			bis.read(buf, 0, 23);


			for (byte b : buf) {

				bos.write(buf, 0, 23);
				bos.flush();
				System.out.print((char)b  +": " +b  );
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("copying ended"); 
			if(inStream!=null)
				inStream.close();
			if(bis!=null)
				bis.close();
			if(baos!=null)
				baos.close();
			if(bos!=null)
				bos.close();
		}	
	}
}
