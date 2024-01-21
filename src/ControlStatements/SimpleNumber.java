package ControlStatements;

public class SimpleNumber {

	public static void main(String[] args) {
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	
	if(args[0].contains(".") || args[1].contains("."))
	{
		System.out.println(a+b);
	}
	else
	{
		System.out.println(a+b);
	}
	}
}