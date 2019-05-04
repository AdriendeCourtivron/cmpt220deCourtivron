
abstract class problem1
{
	public  abstract void printMessage();

}

class class1 extends problem1
{


	@Override
	public void printMessage() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is the first class");
	}
	
	
}

class class2 extends problem1
{

	@Override
	public void printMessage() 
	{
		System.out.println("This is the second class");
		
	}
	
}