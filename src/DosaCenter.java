import java.util.Scanner;


public class DosaCenter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu card please");
		String answ= sc.next();
		
		if (answ.equals("yes")) 
		{
			System.out.println( "      Dosa Center        ");
			System.out.println("============================");
			System.out.println("1. Plain Dosa");
			System.out.println("2. Onion Dosa");
			System.out.println("3. Masala Dosa");
			System.out.println("4. Mysore Masala Dosa");
			System.out.println("5. Rava Dosa");
			System.out.println("6. Panner Dosa");

			System.out.println("Select the type of Dosa");
			int item= sc.nextInt();
			switch(item) {
			case 1 :
				System.out.println("you have selected Plain Dosa");
				System.out.println("Cooking time is : 15 mins");
				System.out.println("Price:10$");
				break;
			case 2 :
				System.out.println("you have selected Onion Dosa");
				System.out.println("Cooking time is : 15 mins");
				System.out.println("Price:11$");
				break;
			case 3 :
				System.out.println("you have selected Masala Dosa");
				System.out.println("Cooking time is : 20 mins");
				System.out.println("Price:12$");
				break;
			case 4 :
				System.out.println("you have selected Mysore Masala Dosa");
				System.out.println("Cooking time is : 25 mins");
				System.out.println("Price:13$");
				break;
			case 5 :
				System.out.println("you have selected Rava Dosa");
				System.out.println("Cooking time is : 25 mins");
				System.out.println("Price:13.50$");
				break;
			case 6 :
				System.out.println("you have selected Paneer Dosa");
				System.out.println("Cooking time is : 25 mins");
				System.out.println("Price:13.50$");
				break;
			default :
				System.out.println("Invalid selection");
			}
			
		}
		else{
			System.out.println("Thank you for Visiting Dosa Center");
		}
		System.out.println("Thank you for Visiting Dosa Center come agian soon");
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}

}
