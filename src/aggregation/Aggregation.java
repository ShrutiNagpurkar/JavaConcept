package aggregation;

class Address{
	String city,state,country;
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class Aggregation
{
	int id;
	String name;
	Address address;
	
	public Aggregation(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("ID: "+id+" Name: "+name);
		System.out.println(address.city+ " "+address.state+" "+ address.country);
		System.out.println(" ");
	}
	
	public static void main(String[] args)
	{
		Address add1 = new Address("mumbai","maharashtra","India");
		Address add2 = new Address("nagpur","maharashtra","India");
		
		Aggregation emp1 = new Aggregation(101,"jack",add1);
		Aggregation emp2 = new Aggregation(102,"rin",add2);
		
		emp1.display();
		emp2.display();
	}
}