import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		int i,m=0,counter=0;    
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number to check its prime or not:");
		int num=sc.nextInt();//it is the number to be checked  
		m=num/2;    
		for(i=2;i<=m;i++){    
			if(num%i==0){    
				System.out.println("Number is not prime");    
				counter=1;    
				break;    
			}    
		}    
		if(counter==0)    
			System.out.println("Number is prime");   
    sc.close();
	}

}
