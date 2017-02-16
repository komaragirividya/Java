package collections;

import java.util.HashSet;

public class CopyElements 
{
 public static void main(String Args[])
 {
	 int x;
	// create object of hashset
	 //add elements to hashset method
	 //copy all elements to object array()
	 HashSet hSet=new HashSet();
	 hSet.add(new String ("Srishti"));
	 hSet.add(new String ("Rahul"));
	 hSet.add(new String ("poornima"));
	 
	 Object[] objArray=hSet.toArray();
	 System.out.println("HashSet elements are copied into an Array.");
	 
	 for(x=0;x<objArray.length;x++)
		 
		 System.out.println(objArray[x]);
	 
	 
	 
	 
 }
}
