package strings;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JaVa";
		String s3 = "python";
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
