package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sort list with last digit
public class ListWithComparable  {

	public static void main(String[] args) {
		
		List<Student1> stud=new ArrayList<Student1>();
		stud.add(new Student1(1, 50));
		stud.add(new Student1(2, 30));
		stud.add(new Student1(3, 57));
		Collections.sort(stud);
		
		for(Student1 s: stud) {
			System.out.println(s);
		}
		
	}

}

class Student1 implements Comparable<Student1>
{
	int rollNo;
	int marks;

	public Student1(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student1 s) {
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
		
	}
	
	
	
}