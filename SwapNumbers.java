package hackthaon;

import java.util.Scanner;

public class SwapNumbers 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a  number: ");
        int n1 = scanner.nextInt();
        System.out.println("Please enter a  another numberto swap: ");
        int n2 = scanner.nextInt();
        
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1+" " +n2);
	}
}
