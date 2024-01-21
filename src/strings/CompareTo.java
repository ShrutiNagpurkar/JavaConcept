package strings;

public class CompareTo {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hello";
		String s2 = "hello ";
		String s3 = "Hello ";
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
	}
}