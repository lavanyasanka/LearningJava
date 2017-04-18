import java.util.Scanner;


public class Temparature {

	public static void main(String[] args) {
		float temperatue;
	    Scanner sc = new Scanner(System.in);      
	 
	    System.out.println("Enter temperatue in Fahrenheit");
	    temperatue = sc.nextInt();
	 
	    temperatue = ((temperatue - 32)*5)/9;
	 
	    System.out.println("Temperatue in Celsius = " + temperatue);
	    
	    System.out.println("Enter temperatue in Celsius");
	    
	    temperatue = sc.nextInt();
		 
	    temperatue = ((9 *temperatue)/5 + 32);
	    
	    System.out.println("Temperatue in Fahrenheit = " + temperatue);
	    
	    sc.close();
	    
	    //T = 9*T/5 + 32

	}

}
