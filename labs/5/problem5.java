import java.util.Scanner;
public class problem5 
{
	    public static void main(String[] args)
	    {
	    	Scanner input = new Scanner(System.in);
	        System.out.println("please enter the nmber of rows");
	        int row = input.nextInt();
	        System.out.println("please enter the nmber of column");
	        int column = input.nextInt();
	        int array[][] = new int[row][column];
	        System.out.println("please enter the numbers for the matrix");
	        for (int i = 0; i < row; i++) 
	        {
	            for (int j = 0; j < column; j++) 
	            {
	                array[i][j] = input.nextInt();
	            }
	        }
	        for (int i = 0; i < row; i++) 
	        {
	            for (int j = 0; j < column; j++) 
	            {
	                System.out.print(array[i][j]);
	            }
	            System.out.println(" ");
	        }
	        System.out.println("---");
	        for (int i = 0; i < column; i++)
	        {
	            for (int j = 0; j < row; j++)
	            {
	                System.out.print(array[j][i]);
	            }
	            System.out.println(" ");
	        }
	    }
	}// main ends

