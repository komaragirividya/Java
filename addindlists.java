package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class addindlists 
{

	public static void main(String args[])
	{
		ArrayList<String> List = new ArrayList();
		List.add("Ravi");
		List.add("sudhir");
		List.add("anjali");
		
		ArrayList<String> List1 = new ArrayList();
		
		List1.add("anjali");
		List1.add("sudha");
		List.addAll(List1);
		Iterator itr = List.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*System.out.println("deleting list2");
		List.removeAll(List1);
		System.out.println("iterating the elements after removing the elements of list1..");
		Iterator itr2 = List.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}*/
		/*System.out.println("Retaining only common elements");
		List.retainAll(List1);  
		  System.out.println("iterating the elements after retaining the elements of al2...");  
		  Iterator itr3=List.iterator();  
		  while(itr3.hasNext()){  
		   System.out.println(itr3.next()); 
		  }*/
	}

}
