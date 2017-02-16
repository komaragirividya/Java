package numbPattern;
/*12345
2345
345
45
5*/
public class Pattern6 
{
	public static void main(String[] args) 
	{
	
		for(int i=0;i<5;i++)
		{
            for(int j=i+1;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
		
	}

}
