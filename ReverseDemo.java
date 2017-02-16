package hackthaon;

import java.util.Scanner;

public class ReverseDemo 
{
	 
	    // Method to return the reverse of a number
	    public int reverse(int num) {
	        int revNum = 0;
	        while (num > 0) {
	            int rem = num % 10;
	            revNum = (revNum * 10) + rem;
	            num = num / 10;
	        }
	        return revNum;
	    }
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Please enter a number: ");
	        int num = scanner.nextInt();
	        
	       

	        ReverseDemo rnd = new ReverseDemo();
	        int revNum = rnd.reverse(num);
	        
	        
	        System.out.printf("\n The reverse of number %d is %d ", num, revNum);
	       
	    }
	    
}
