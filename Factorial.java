package hackthaon;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		int x=1,i;
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a  number: ");
        int n1 = scanner.nextInt();
			for(i=1;i<=n1;i++)
			{
		x = x*i;
		    }
			 System.out.println("Factorial of "+n1+" is: "+x);    
	}
}
