package javaCoding;

import java.util.Scanner;

public class Sumofcubesandsquares
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 
	      System.out.print("Enter Integer: ");
	      int n = sc.nextInt();
	      System.out.println("You entered: " + n);
	 
	      int sum = 0;
	      int a=0,b=0;
	 
	      for (int x=2;x<=n;x++) 
	      {
	    	  if(x%2==0){
	        a = a + (x*x);
	      }
	    	  else
	    		  b = b + (x*x*x);  
	      }
	      System.out.println(a+b);
	 
	}

}
