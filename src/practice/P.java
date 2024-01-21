package practice;
//single inhertitance
class A{
	int a;
    A()
    {
	System.out.println("A constructor");
    }

    void Ab()
    {
	 System.out.println("AB method");
    }
}

class B extends A
{
	int b;
	B()
	{
		System.out.println("B constructor");
	}
	
	void Ba()
	{
		System.out.println("BA method");
	}
}

class C extends B //multilevel
{
	void Cb()
	{
		System.out.println("CB method");
	}
}

class D extends A //Hierarchical
{
	void Da()
	{
		System.out.println("DA method");
	}
}

public class P {

	public static void main(String[] args) {
		B b = new B();
		b.Ba();
		b.Ab();
	}
}