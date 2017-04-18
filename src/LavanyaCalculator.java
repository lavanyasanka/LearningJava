
public class LavanyaCalculator {

	public static void main(String[] args) {
	
		int X = 15;
		int Y = 20;
		int sum = X + Y;
		int Diff = X - Y;
		int Prod = X * Y;
		int Div = X / Y;
		int Modd = X % Y;
		System.out.println("***************CALCULATOR*****************");
		System.out.println("1. Sum of X and Y is " +sum);
		System.out.println("2. Difference of X and Y is " +Diff);
		System.out.println("3. Product of X and Y is " +Prod);
		System.out.println("4. Dividend of X and Y is " +Div);
		System.out.println("5. Square root of X is "+ Math.sqrt(X));
	    System.out.println("6. Power of X,Y is " + Math.pow(X, Y));
	    System.out.println("7. Modular division of X and Y is " + Modd);


	}

}
