package inputoutput;

import java.io.IOException;
import java.io.FileInputStream;

public class FileReadingByte {

   public static void main(String[] args) throws IOException {
      FileInputStream fis = null;
      int i = 0;
      char c;
      byte[] bs = new byte[25];
      
      try {

         fis = new FileInputStream("C://hello.txt");
         i = fis.read(bs);
         System.out.println("Number of bytes read: "+i);
         System.out.print("Bytes read: ");

         for(byte b:bs) {
            c = (char)b;
            
            System.out.print(c);
         }  
         
      } catch(Exception ex) {
      

         ex.printStackTrace();
      } finally {

         if(fis!=null)
            fis.close();
      }
   }
}