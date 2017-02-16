package hackthaon;

import java.util.Scanner;

public class SeriesSum 
{
	public static void main(String args[])  
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number 'x': ");
        int x = scanner.nextInt();
        
        System.out.println("Please enter a number 'n': ");
        int n = scanner.nextInt();
        
		int i;
		double sum = 0;
		
		
		for(i=1;i<=n;i++)
		{ 
			sum=(x+((Math.pow(x,n)/n)));
		}
		System.out.println(+sum);
	}
}
