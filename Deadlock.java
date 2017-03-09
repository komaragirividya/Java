package javaCoding;
//Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. 
//Deadlocks can occur in Java when the synchronized keyword causes the executing thread to block 
//while waiting to get the lock, associated with the specified object 


public class Deadlock 
{
    String s1="java";
    String s2="program";
    
    Thread t1 = new Thread("Thread1")
    {
    	public void run()
    	{
    		while(true)
    		{
    			synchronized(s1)
    			{
    				synchronized(s2)
    				{
    					System.out.println(s1+s2);
    				}
    			}
    			
    		}
    	}
    };
    	

    
    Thread t2 = new Thread("Thread2")
    {
    	public void run()
    	{
    		while(true)
    		{
    			synchronized(s1)
    			{
    				synchronized(s2)
    				{
    					System.out.println(s1+s2);
    				}
    			}
    			
    		}
    	}
    };
    	
 
    
    public static void main(String args[])
    {
    	Deadlock d = new Deadlock();
    	d.t1.start();
    	try {
			d.t1.wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	d.t2.start();
    	
    	/*d.t1.stop();
    	d.t2.stop();*/
    }
    
    }
