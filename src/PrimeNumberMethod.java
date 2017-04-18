import java.util.Scanner;


public class PrimeNumberMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
		s.close();
	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
