package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Student
{
	int rollno;
	String name;
	int Age;
	Student(int rollno,String name,int Age)
	{
		this.rollno=rollno;
		this.name=name;
		this.Age=Age;
		
	}

	public static void main(String[] args) 
	{
		Student st1 = new Student(1,"sonal",29);
		Student st2 = new Student(2,"sonali",27);
		Student st3 = new Student(6,"sonam",22);
		ArrayList<Student> List = new ArrayList<Student>();
		List.add(st1);
		List.add(st2);
		List.add(st3);
		//Getting iterator
		Iterator itr=List.iterator();
		//transversing elements of array list
		
		while(itr.hasNext())
		{
			Student s = (Student)itr.next();
			System.out.println(s.rollno+" " +s.name+" "+s.Age);
		}
			 
		
		
		

	}

}
