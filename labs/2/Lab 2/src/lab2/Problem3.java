package lab2;
import java.util.Scanner;

public class Problem3 {

	private static final String HighNum = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the lowest number");
		double lowNum = input.nextByte(); 
		System.out.println("please enter the high number");
		double highNum = input.nextByte();
		double ans = Math.random() * (highNum - lowNum) + lowNum;
		System.out.println("The number is" + ans);
	}

}
