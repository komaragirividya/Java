//how to convert given list of strings to comma seperated values (csv) format.
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class csvFormat 
{
	public String getCsvString(List<String> list)
	{
		StringBuilder sb=new StringBuilder();
		for(String str:list)
		{
			if(sb.length()!=0){
				sb.append(",");}
			sb.append(str);
		}
		return sb.toString();
		
	}

	public static void main(String[] args) 
	{
		List<String> L1 = new ArrayList<String>(){
	 {
		this.add("Ravi");
		this.add("sudhir");
		this.add("anjali");
		}
		};
		csvFormat csv= new csvFormat();
		System.out.println(csv.getCsvString(L1));

	}

}
