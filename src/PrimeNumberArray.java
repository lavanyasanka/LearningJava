import java.util.Scanner;


public class PrimeNumberArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];int m=0,counter=0,primecount=0; 

		for(int index=0;index<a.length;index++){
			System.out.println("enter element at index"+ index );
			a[index]=sc.nextInt();	
		}

		for(int index=0;index<a.length;index++) {  
			m=a[index]/2;  
			counter=0;  
			for(int i=2;i<=m;i++){    
				if(a[index]%i==0){    
					counter++;    
				}    
			}    
			if(counter==0){  
				primecount++;
				System.out.print(a[index]+","); 
			}
		}
		System.out.println("are "+primecount+" prime numbers in the given array");
		sc.close();


	}
}
