import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		double ounces = input.nextDouble();
		double grams = 0;
		
		grams = ounces * 28.3495;
		System.out.println(ounces + " " + "ounces is"+" "+ grams);
		
	}

} 	