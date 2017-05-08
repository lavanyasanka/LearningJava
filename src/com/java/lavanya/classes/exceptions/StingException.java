package exceptions;

public class StingException {
	
	public static void main(String[] args) {

		try{
			String str="lavanya";
			System.out.println(str.length());;
			char c = str.charAt(0);
			c = str.charAt(40);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index Out Of Bounds Exception!!");
		}
	}
}
