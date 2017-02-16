package hackthaon;


public class Divisible 
{
	public static void main(String args[])  
	{
        
		int i,n=0,count=0;
		
		
		
		for(i=100;i<200;i++)
		{ 
			if(i%8==0)
	              n+=i;
			if(i%8==0)
			count++;
			
		}
		System.out.println("sum of integers divisble by 8 between 100 and 200 is : "+n);
		System.out.println("number of integers divisble by 8 between 100 and 200 is : "+count);
	}

}
