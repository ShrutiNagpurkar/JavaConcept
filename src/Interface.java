interface A{
	int MIN = 5;
	void print();
}

class B implements A{
	public void print()
	{
		System.out.println(MIN);
	}
}
public class Interface {

	public static void main(String[] args) {
		A a = new B();
		a.print();

	}

}
