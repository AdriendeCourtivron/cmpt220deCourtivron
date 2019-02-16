package lab2;
import java.util.Scanner;

public class Problem1 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int number1 = input.nextByte(); 
		System.out.println("please enter the second number");
		int number2 = input.nextByte();
		if (number1 < number2) {
			System.out.println(number1+ "is less than"+" "+number2);
		}
		if (number1 <= number2){
			System.out.println(number1 + " is less than or equal to" + " "+number2);
			}
		if (number1 == number2){ 
			System.out.println(number1 + " is equal to" + " " + number2);
			}
		if (number1 != number2) {
			System.out.println(number1 + " is not equal" + " " + number2);
			}
		if (number1 > number2) {
			System.out.println(number1 + " is greater than" + " " + number2);
			}
		if (number1 >= number2) {
			System.out.println(number1 + " is greater than or equal to" + " " +number2);
			}
		}
}

