public class Rectangle implements Printable
{
	private int length;
	private int width;
	 
    Rectangle(int length, int width)
    {
    	this.length = length;
    	this.width = width;
    }

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle with width: " + this.width + "and length of: " + this.length);
	}

	
}
 class SportsCar implements Printable
{
	String brand;
	int model;
	
	SportsCar(String brand, int model)
	{
		this.brand = brand;
		this.model = model;
	}

	@Override
	public void print() {
		System.out.println("The car Brand is: " +this.brand + "the model is: " + this.model);		
	}
}
 
class part4 implements Printable
{
	String name;
	int age;

	part4()
	{
		this.name = name;
		this.age = age;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The name of the manager is" + this.name + "the age is: " + this.age);
		
	}
}
