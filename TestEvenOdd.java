package javaCoding;
//:even/odd without using % or / operator 

public class TestEvenOdd 
{
public static void main(String args[])
{
	int num=7;
	int result=num;
	while(result>=2)
	{
		result=result-2;
		
	}
	if(result==1)
		System.out.println("number is odd");
	else
		System.out.println("number is even");
	
}
}
