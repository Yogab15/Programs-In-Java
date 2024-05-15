package forGit;


/*1. Write a Java program to get a number from the user and print whether it is positive or negative.*/

 
import java.util.Scanner;

public class PositiveNegativeProg{

	public static void main(String[] args) 
		 {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
		int a=sc.nextInt();
		
		
		if (a<0)
		{
			System.out.println("you enter negative number : "+a);
		}
		else if(a>0)
		{
			System.out.println("you enter positive number :"+a);
		}
		else
		{
			System.out.println("Please enter less than or greater than 0 .");
		}
		
	 }
}

		
	


