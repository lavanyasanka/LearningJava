import java.util.Scanner;


public class SumofDiagonal {

	public static void main(String[] args) {
		int sum = 0;
		int a[][]= new int[3][3]; 
		Scanner sc = new Scanner(System.in);
		for(int row=0; row < a.length; row++){

			for(int col=0; col < a[row].length; col++){
				System.out.print("Enter the elements of 2d array ");
				a[row][col] = sc.nextInt();
				
			}
			System.out.println();
		}
/*		System.out.println("The elements of 2d Array are ");
		for(int row=0;row<a.length;row++){

			for(int col =0;col<a[row].length;col++){
				System.out.println(a[row][col]);
			}
		}*/
	    for (int row=0; row < a.length; row++)
	    {
	        for (int col=0; col < a[row].length; col++)
	        {
	        	if(row == col)
	            sum = sum + a [row][col];
	        }
	    }
	    System.out.println("sum of diagonal elements are "+sum);
	    
	    sc.close();

	}

}
