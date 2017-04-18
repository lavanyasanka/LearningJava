import java.util.Scanner;


public class Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter gross salary");
		int sal = sc.nextInt();
		double pf=0.0;
		double da=0.0;
		double hra=0.0;
		double temp = 0.0;
	
	   // a) sal of employee is > 10000 and <=20000 (PF 2, DA=3, HRA = 5)
	   // b) sal of employee is > 20000 and <=30000 (PF 3, DA=4, HRA = 6)
		
		if( (sal>= 10000)&& (sal<=20000))
		{
			pf= 0.02* sal;
			da= 0.03 *sal;
			hra= 0.05 * sal;
			System.out.println( "\npf = "+pf+" \nda = "+da+" \nhra="+hra);
			
		}
		else if((sal>= 20000)&& (sal<=30000))
		{
			pf= 0.03* sal;
			da= 0.04 *sal;
			hra= 0.06 * sal;
			System.out.println( "\npf = "+pf+" \nda = "+da+" \nhra="+hra);
		}
		else
		{
			System.out.println("Salary out of defined range");
		}
		temp = (( pf + hra ) - da);
		System.out.println("enter insurance amount");
		float insurance = sc.nextFloat();
		System.out.println("Take home salary=" + (sal - insurance - temp));
		sc.close();
	}

 }
