package javaCoding;

import java.util.Scanner;

public class palindrome 
{

	public static void main(String args[])  
	{
		 int reverse=0;
         int rem,a;
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        a=num;
         while(num>0)
         {
          rem = num % 10;
         reverse = (reverse * 10) + rem;
         num = num / 10;
         }
        if(a==reverse)
        	 System.out.println("is palindrome ");
        else
        	 System.out.println("is not palindrom");
        	
	}
}
