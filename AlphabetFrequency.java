package javaCoding;

import java.util.Scanner;

public class AlphabetFrequency 
{

	public static void main(String args[])  
	{

		//String ip="navneet"; 
		String ip="abca"; 
		int count=0; 
		char [] input = ip.toCharArray(); 
		System.out.println("Duplicate Characters are as follows:"); 
		for(int i=0;i<ip.length();i++) 
		{ 
		   for(int j=i+1;j<ip.length();j++) 
		   { 
		     if(input[i]==input[j]) 
		    { 
		    	 for (int x=ip.length();x<ip.length()-j;x++)
		    	 {
		    		    count ++; 
		    	 }
		   
		     
		        System.out.println(count++); 
		        break;
		      } 
		    } 
		} 

	}

}
