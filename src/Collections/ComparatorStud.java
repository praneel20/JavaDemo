package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStud {

	public static void main(String[] args) {
		
		List<Student> stud=new ArrayList<Student>();
		stud.add(new Student(1, 50));
		stud.add(new Student(2, 30));
		stud.add(new Student(3, 57));
		
		Comparator<Student> studcomp=new StudComp();
		Collections.sort(stud, studcomp);
		
		for(Student s: stud) {
			System.out.println(s);
		}
		
		
		/*Collections.sort(stud, (s1,s2) -> {
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
		});
		
		for(Student s: stud) {
			System.out.println(s);
		}*/
		
	}

}

class Student
{
	int rollNo;
	int marks;

	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
	
}