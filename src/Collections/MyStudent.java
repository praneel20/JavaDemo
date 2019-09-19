package Collections;

public class MyStudent {
		int rno;
		String name;
		String grade;
		int marks;
		
		public MyStudent(int rno, String name, String grade, int marks) {
			super();
			this.rno = rno;
			this.name = name;
			this.grade = grade;
			this.marks= marks;
			
		}
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		
		
}
