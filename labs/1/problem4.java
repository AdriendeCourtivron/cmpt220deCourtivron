import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the mass of an object");
		double mass = input.nextDouble();
		double speedOfLight = 299972458;
		double e = 0;
		e=mass * speedOfLight;
		
		
		System.out.println("the E is equal to" + e+" ");
		
	}

}