package lab2;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number");
		char number1 = input.next().charAt(0); 
		int value  = number1;
		System.out.println("please enter the second number");
		char number2 = input.next().charAt(0);
		int value2 = number2;
		double sum = value + value2;
		System.out.println("The sum is " + sum);
		
	}
}
