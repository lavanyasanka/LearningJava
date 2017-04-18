import java.util.Scanner;


public class LavanyaCalcDynamic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			int X;
			int Y;
			System.out.println("Enter the value for X :");
			X = sc.nextInt();
			System.out.println("Enter the value for Y :");
			Y = sc.nextInt();
			System.out.println("***************CALCULATOR*****************");
			System.out.println("1.Sum of X and Y is " + (X + Y));
			System.out.println("2.Difference of X and Y is " + (X - Y));
			System.out.println("3.Product of X and Y is " + (X * Y));
			System.out.println("4. X Divided by Y is " + (X / Y));
			System.out.println("5. Square root of X is "+ Math.sqrt(X));
			System.out.println("6. Square root of Y is "+ Math.sqrt(Y));
		    System.out.println("7. Power of X,Y is " + Math.pow(X, Y));
		    System.out.println("8. Power of Y,X is " + Math.pow(Y, X));
		    System.out.println("9. Modular division of X and Y is " + (X % Y));

	}

}
