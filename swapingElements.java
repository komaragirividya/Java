package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swapingElements 
{
	public static void main(String args[])
	{
		ArrayList<String> List = new ArrayList();
		List.add("Ravi");
		List.add("sudhir");
		List.add("anjali");
		List.add("java");
		List.add("javascript");
		List.add("angularjs");
		
		Collections.swap(List, 1, 3);
		Collections.swap(List, 3, 4);
		for(String str:List)
			System.out.println(str);
		
		
	}
	

}
