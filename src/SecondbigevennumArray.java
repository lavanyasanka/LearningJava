
public class SecondbigevennumArray {

	public static void main(String[] args) {
		
		int p[] = {1,9,22,32,31};
	
		int evenNumbers[] = findEvenNumbers(p);
	    int seccondBiggestevennum =findSecondBigNumbers(evenNumbers);

		//for(int value: evenNumbers){
			//System.out.println(value);
		//}
		
		System.out.println("Second biggest even number is " +seccondBiggestevennum);
	}
	private static int [] findEvenNumbers(int[] p) {

		int numbers[] = new int[p.length];
		
		int i = 0;
 		for(int value: p){
			if(value%2 == 0){
				numbers[i] = value;
				System.out.println(value);
			}
			i++;
		}
 		return numbers;
		
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
		return secondbig;
	}
}
