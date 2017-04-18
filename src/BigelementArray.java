import java.util.Scanner;


public class BigelementArray {

	public static void main(String[] args) {
		
		int a[] = new int [5];
		int big, secondbig;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter the Array Values");
		for(int i=0;i<5;i++){
			System.out.println("Please Enter the "+(i+1)+" value");
			a[i]= sc.nextInt();
		}
		big = a[0];
		secondbig=a[1];
        for(int i = 1; i < 5; i++)
        {
            if(big < a[i])
            {  secondbig = big;
                big = a[i];
            }
            else if(secondbig < a[i]){
            	secondbig = a[i];
            	//System.out.println("hhhhhhhhhhhhhhhhhhh");
            	}
        }
        System.out.println("Biggest element in an Array is:" +big);
        System.out.println("Second Biggest element in an Array is : " +secondbig);
        sc.close();
	}

}


