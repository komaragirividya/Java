package hackthaon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CollctionFrameWork 
{
	public static void main(String[] args) 
	{
	      ArrayList customer = new ArrayList();// A List contains instances of Object. Upcast ArrayList to List
	      customer.add(("990,ABC,91234"));            // add() takes Object. String upcast to Object implicitly
	      customer.add(("990,ZBCA,01234"));
	      customer.add(("990,CAB,12034")); 
	      customer.add(("990,PQR,1234")); 
	      //PRINTING THE LIST
	      System.out.println(customer);
	      //SORTING THE LIST
	      Collections.sort(customer);  
	      Iterator itr=customer.iterator();  
	      while(itr.hasNext())
	      {  
	      System.out.println(itr.next());      
	      }
	      
	      
	      
	      
	    
	   }
	}
	
