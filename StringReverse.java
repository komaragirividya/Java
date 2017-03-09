package javaCoding;
//reverse a string using recursive algorithm.
public class StringReverse 
{

	String s="";
	public static void main(String args[])
	{
		StringReverse sr = new StringReverse();
		System.out.println("Result :  "+sr.reverse("java") );
	}
	
	public String reverse(String str)
	{
		if(str.length()==1)
		{
		return str;
		}else
			 s += str.charAt(str.length()-1)
             +reverse(str.substring(0,str.length()-1));
     return s;

		
	}
}
