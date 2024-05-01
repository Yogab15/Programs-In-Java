package MyGit;


/*  Write a Java program that takes three numbers from the user and prints the greatest number. */

 
import java.util.Scanner;

public class ComparisionProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second number : ");
        int b=sc.nextInt();
        System.out.println("Enter Third number : ");
		int c=sc.nextInt();
		
		
		if (a>b&& a>c)
		{
			System.out.println(" First Number is is greater ... ");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second Number is greater ...");
		}
		else
		{
			System.out.println("Third Number is greater ...");
		}
	}

}
