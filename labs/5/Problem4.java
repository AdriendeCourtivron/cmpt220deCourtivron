import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4 
{
	   public static void main(String[] args) 
	   {
	        Scanner input = new Scanner(System.in);
			// JA: These should be in a loop
			System.out.println("please enter the first number");
			int num1 = input.nextInt();
			System.out.println("please enter the second number");
			int num2 = input.nextInt();
			System.out.println("please enter the third number");
			int num3 = input.nextInt();
			System.out.println("please enter the first number for the second array");
			int num4 = input.nextInt();
			System.out.println("please enter the second number for the second array");
			int num5 = input.nextInt();
			System.out.println("please enter the third number for the second array");
			int num6 = input.nextInt();
	        boolean arraysEqual = false;
	        int [] array1 = {num1,num2,num3};
	        int [] array2 = {num4,num5,num6};
	        int max1 = 0;
	        int max2 = 0;
	        int count = array1.length;
	        for (int i = 0; i < count;i++)
	        {
	        	max1 = max1 + array1[i];
	        }
	        System.out.println(max1);
	        for (int j = 0; j < count; j++)
	        {
	        	max2 = max2 + array1[j];
	        }
	        System.out.println(max2);
	        if (max1 == max2)
	        {
	        	arraysEqual = true;
	        }
	        System.out.println(arraysEqual);
	    }

}//main ends

