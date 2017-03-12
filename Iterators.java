package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators 
{
	public static void main(String args[])
	{
		ArrayList<String> List = new ArrayList();
		List.add("Ravi");
		List.add("sudha");
		List.add("29");
		//transversing the list through iterator
		Iterator itr = List.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}

}
