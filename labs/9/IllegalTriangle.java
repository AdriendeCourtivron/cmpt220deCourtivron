
public class IllegalTriangle extends RuntimeException
{
	IllegalTriangle(String msg)
	{
		super(msg);
	}
	
	IllegalTriangle()
	{	
		super("The sites of the triangle are illegal");
	}
}
