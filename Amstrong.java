package hackthaon;

import java.util.Scanner;

public class Amstrong 
{

	public static void main(String args[])  
	{
		int x,y=0;
	     
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a 3digit number: ");
        int num = scanner.nextInt();
        int n=num;
        while(num > 0){
			x = num % 10;
			y = y + (int)Math.pow(x,3);
			num = num / 10;
		}
		if(y == n)
			System.out.println(n+" is an Armstrong Number");
		else
			System.out.println(n+" is not a Armstrong Number");
	}
        
	}

