package javaCoding;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//Convert a given string as "11/12/2010" to a Date object
public class StringToDate 
{

	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = "3/3/2017";
		Date e = sdf.parse(dateString);
		System.out.println(e);

	}

}
