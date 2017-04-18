import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		int remainder,sum=0,temp;  

		System.out.println("Please enter a number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(); 
		temp=number;  
		while(number>0){    
			remainder=number%10;  //getting remainder  
			sum=(sum*10)+remainder;    
			number=number/10;    
		}    
		if(temp==sum)    
			System.out.println("The entered number "+temp+ "is a Palindrome number ");    
		else    
			System.out.println("The entered number "+temp+" is not a Palindrome number");  
      sc.close();
	}

}
