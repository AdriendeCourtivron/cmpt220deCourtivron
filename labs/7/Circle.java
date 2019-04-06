
public class Circle 
{

	private double x; 
	private double y; 
	private double radius;

	Circle() 
	{
		x = 0;
		y = 0;
		radius = 0;
	}

	Circle(double x, double y, double radius) 
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() 
	{
		return x;
	}

	public double getY() 
	{
		return y;
	}

	public double getRadius() 
	{
		return radius;
	}

	public double getArea() 
	{
		double tempA =(Math.pow(radius, 2));
		double Area = Math.PI * (tempA);
		return (Area);
	}

	public double getPerimeter() 
	{
		double Perm = 2 * Math.PI * radius;
		return (Perm);
	}

	public boolean contains(double x, double y) 
	{
		boolean nice = false;
		double xOverY = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)); 
		if(xOverY < radius)
		{
			nice = true;
		}
		return nice;
	}

	public boolean contains(Circle circle) 
	{
		 
		 return this.contains(circle.x,circle.y);
		 }
	boolean overlaps (Circle circle)
	{
		return ((this.x-x) * (this.x-x) + (this.y-y) * (this.y-y) <= (circle.radius + radius) * (circle.radius + radius));
	}
}