package numbPattern;
/*9
97
975
9753
97531*/
public class Pattern3 {

	public static void main(String[] args) 
	{
		for(int i=9;i>=1;i=i-2)
		{
            
            for(int j=9;j>=i;j=j-2)
            {
            	System.out.print(j);
            }
            System.out.println();
        }

	}

}
