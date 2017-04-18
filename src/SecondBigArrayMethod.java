
public class SecondBigArrayMethod {

	public static void main(String[] args) {
		int x[] = {2,3,4,5};
		int seccondBiggestnum =findSecondBigNumbers(x);
		System.out.println("Second biggest number is " +seccondBiggestnum);
	}
	private static int  findSecondBigNumbers(int[] p) {

		int big, secondbig;
		big = p[0];
		secondbig=p[1];
		for(int i = 1; i < p.length; i++)
		{
			if(big < p[i])
			{  secondbig = big;
			big = p[i];
			}
			else if(secondbig < p[i]){
				secondbig = p[i];
			}
		}
		System.out.println("Biggest element in an Array is:" +big);
		return secondbig;
	}

}


