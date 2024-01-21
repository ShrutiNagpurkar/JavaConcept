package ControlStatements;

public class GuestAdmin{

	public static void main(String[] args) {
		String a = "--admin";
		String b = "--guest";
		String inputArguments = String.join(",", args);
		
	    if(inputArguments.contains(a) && inputArguments.contains(b))
	    {
	        System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
	    }
		else if(inputArguments.contains(a))
		{
		    System.out.println("Hello, Admin!");
		}
		else if(inputArguments.contains(b))
		{
		    System.out.println("Hello, Guest! ");
		}
	}
}