import java.util.Scanner;

public class problem1 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the three sides of a triangle");
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("please enter a color");
		String color = input.next();
		
		boolean filled;
		System.out.println("Please put a 1 if the traingle is fille / 0 if it is empty");
		int isFilled = input.nextInt();
		
		if (isFilled == 0)
		{
			filled = false;
		}
		
		else
		{
			filled = true;
		}
		
		Triangle newShape = new Triangle(side1, side2, side3);
		newShape.setColor(color);
		newShape.setFilled(filled);
		
		System.out.println("Perimeter =" + newShape.getPerm());
		System.out.println("Area =" + newShape.getArea());
		System.out.println("Color =" + newShape.getColor());
		System.out.println("Triangle filled =" + newShape.isFilled());
		System.out.println(newShape.toString());
	
	}
	
}
