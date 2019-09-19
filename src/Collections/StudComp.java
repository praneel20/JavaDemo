package Collections;

import java.util.Comparator;

public class StudComp implements Comparator<Student> {

	public StudComp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.marks>o2.marks)
			return 1;
		else	
		return -1;
	}

}
