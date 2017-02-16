package collections;
//Java Program to Check if a particular key exists in HashMap
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyinHashmap 
{
	public static void main(String args[]) { 
		
		
		Map<Integer, String> idToName = new HashMap<Integer, String>() 
		{ 
			{
				put(1, "Johnny"); put(12, "Root"); put(3, "Shane"); 
	}
		};
		
		System.out.println(idToName); 
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt(); 
		
		System.out.println("Please enter a key to check in Map?"); 
		
		// checking if key exists in HashMap 
		if (idToName.containsKey(key)) 
		{ 
			System.out.println("given key exits in Map"); 
		} 
		else { 
			System.out.println("given key doesn't exists in Map"); 
			} 
		 
		}
	}


