package instanceBlock;

class Test {

	int a,b;
	Test()
	{
		a = 50;
		b = 100;
		System.out.println(a+ " "+b);
	}
	
	//Instance Block
	{
		a = 5;
		b = 1;
		System.out.println(a+ " "+b);
	}
	
	void Show()
	{
		System.out.println("this is running");
	}
}

public class InstanceBlock
{
	public static void main(String[] args) {
		Test b = new Test();
		b.Show();
}
}
