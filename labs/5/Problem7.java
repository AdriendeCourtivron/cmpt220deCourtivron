import java.util.Scanner;
public class Problem7 
{
	public static void main(String[] args)
	{
	        int numRow = 0;
	        int numColumn = 0;
	        boolean triangle = true;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Please enter num of rows ");
	        numRow = input.nextInt();
	        System.out.println("Enter total number of columns: ");
	        numColumn = input.nextInt();
	        int triMatrix[][] = new int[numRow][numColumn];
	        for (int i = 0; i < numRow; i++)
	        {//for begins
	            for (int j = 0; j < numColumn; j++)
	            {//for begins
	                System.out.println("please enter the number first number" );
	                triMatrix[i][j] = input.nextInt();
	            }//for ends
	        }//for ends
	       
	        for (int i = 0; i < numRow; i++)
	        {//for ends
	        	
	            for (int j = 0; j < i; j++) 
	            {//for ends
	            	
	                if (triMatrix[i][j] != 0)
	                {//if begins
	                	triangle = false;
	                    break;
	                }//if ends
	                
	            }//for ends
	            
	            if (!triangle)
	            {//if begins
	                break;
	            }//if ends
	            
	        }//for ends
	        if (triangle)
	        	
	        {//if begins
	            System.out.println("true");
	        } //if ends
	        else 
	        {//else begins
	            System.out.println("false");
	        }//else end
	    }//end
	}//main end

