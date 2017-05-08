package exceptions;

public class ExceptHandlwWithThrows {

	static void throwMethod() throws NullPointerException
	{
		System.out.println ("Inside throw Method");
		throw new NullPointerException ("ExceptHandlwWithThrows"); 
	} 
	public static void main(String args[])
	{
		try
		{
			throwMethod();
		}
		catch (NullPointerException exp)
		{
			System.out.println ("The exception get caught" +exp);
		}
	}
}
