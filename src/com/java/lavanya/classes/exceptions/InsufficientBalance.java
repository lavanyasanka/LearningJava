package exceptions;

public class InsufficientBalance extends Exception {
	 String s1;
	 InsufficientBalance(String s2) {
	      s1 = s2;
	   } 
	   @Override
	   public String toString() { 
	      return ("Output String = "+s1);
	   }
}
