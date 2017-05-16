package inputoutput;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

public class BufferedWriterExample {
	
	public static void main(String[] args) throws IOException {
		
	      StringWriter sw = null;
	      BufferedWriter bw = null;
	      
	      String str = "Hello how are you .....";
	      
	      try {
	      
	         
	         sw = new StringWriter();
	         
	         bw = new BufferedWriter(sw);
	         
	         bw.write(str);
	         
	         bw.flush();
	         
	         StringBuffer sb = sw.getBuffer();
	         
	         System.out.println(sb);
	            
	      } catch(IOException e) {
	      
	         e.printStackTrace();
	      } finally {
	            sw.close();
	            bw.close();
	      }
	   }

}
