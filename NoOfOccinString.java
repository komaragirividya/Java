package javaCoding;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class NoOfOccinString 
{
	public static void main(String args[])  
	{
		String str = "";
		 
		 Scanner in= new Scanner(System.in);
		 System.out.println("Please enter a String");
		 
		 str=in.nextLine();
		 
		 System.out.println("Please enter a Character");
		 String chr=in.next();
		 
		 int charCount = str.length() - str.replaceAll("a", "").length();
		 
		 System.out.println("Number of occurances of given character:"+charCount);
	}
}
