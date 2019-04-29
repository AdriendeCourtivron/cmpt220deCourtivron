class Triangle extends GeometricObject 
{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle()
	{
		
	}
	 Triangle (double side1, double side2, double side3)
	 {
		 this.side1 = side1;
		 this.side2 = side2;
		 this.side3 = side3;
	 }
	public double getSide1() 
	{
		return side1;
	}
	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}
	public double getSide2() 
	{
		return side2;
	}
	public void setSide2(double side2) 
	{
		this.side2 = side2;
	}
	public double getSide3()
	{
		return side3;
	}
	public void setSide3(double side3) 
	{
		this.side3 = side3;
	}
	public double getPerm()
	{
		double perm = side1 + side2 + side3;
		return perm;
	}
	
	public double getArea()
	{
		double p = (side1 + side2 + side3)/2;
		double area = Math.sqrt(p * (p - side1) * p *(p - side2) * p * (p - side3));
		return area;
	}
	public  String toString()
	{
		return "Triangle: side 1 =" + side1 + " side 2 =" + side2 + " side 3 =" + side3;
	}
	 
}
