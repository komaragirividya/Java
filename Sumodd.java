package javaCoding;

public class Sumodd 
{
	public static void main(String[] args)
	{
		int sum=0;
		int sum1=0;
	

		for(int i=1;i<=100;i++)

		{

		if(i%2!=0)

		{

		sum=sum+i;

		}

		}
		System.out.println(sum);
		
		for(int i=1;i<=100;i++)

		{

		if(i%2==0)

		{

		sum1=sum1+i;

		}

		}
		System.out.println(sum1);
	}
	
}
