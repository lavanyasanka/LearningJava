import java.util.Scanner;


public class SumofelementArray {

	public static void main(String[] args) {
		int a[] = new int [5];
		int sum;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter the Array Values");
		for(int i=0;i<5;i++){
			System.out.println("Please Enter the "+(i+1)+" value");
			a[i]= sc.nextInt();
		}
		sum = a[0];
        for(int i = 1; i < 5; i++)
        {
            
                sum = sum+ a[i];
            
        }
        System.out.println("Biggest element in an Array is:"+sum);
        sc.close();

	}

}
