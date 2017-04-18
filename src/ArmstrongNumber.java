import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		 int count = 0,mod,temp;  
		 System.out.println("Please enter a number:");
		 Scanner sc=new Scanner(System.in);
		    int number=sc.nextInt();//It is the number to check Armstrong  
		    temp=number;  
		    while(number>0)  
		    {  
		    mod=number%10;  //153%10 = 3, 15%10=5,1%10=1
		    number=number/10;  //153/10=15, 15/10= 1/10
		    count=count+(mod*mod*mod);  //(3*3*3=27,5*5*5=125, 1)
		    }  
		    if(temp==count)  
		    System.out.println("The entered number is a Armstrong number");   
		    else  
		        System.out.println("The entered number is Not a Armstrong number");   
 
		    sc.close();
	}

}

