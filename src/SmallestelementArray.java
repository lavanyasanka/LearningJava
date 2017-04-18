import java.util.Scanner;


public class SmallestelementArray {

	public static void main(String[] args) {
		int a[] = new int [5];
		int small;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter the Array Values");
		for(int i=0;i<5;i++){
			System.out.println("Please Enter the "+(i+1)+" value");
			a[i]= sc.nextInt();
		}
		small = a[0];
        for(int i = 0; i < 5; i++)
        {
            if(small > a[i])
            {
                small = a[i];
            }
        }
        System.out.println("Smallest element in an Array is:"+small);
        sc.close();
	}

}
