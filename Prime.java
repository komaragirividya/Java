package hackthaon;

import java.util.Scanner;

public class Prime 
{

	public static void main(String args[])  
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter number");
		 int n= scanner.nextInt();
		int flag=0;
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
			 
				 System.out.println("number is not prime"); 
			flag=1;
			 break;
			 
		 }
		 if(flag==0) 
		 System.out.println("number is prime");
		 
	}
}
