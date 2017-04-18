import java.util.Scanner;
public class AlphabetCheck {

	public static void main(String[] args) {

		int count=0;
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		//for(char i='a';i<='z';i++)
		for(int i=0;i<text.length();i++)
		{
			for(int j=0;j<text.length();j++)
			{
				if(text.charAt(j)== text.charAt(i))
					count++;
			}
			if(count!=0)
				System.out.print(text.charAt(i)+""+count);
				count=0;
		}
		sc.close();
	}

}


