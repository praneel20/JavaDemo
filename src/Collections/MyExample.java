package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MyExample {

	
	
	
	public static void main(String[] args) {
		
		int studCount=0;
		/*System.out.println("Enter number of students: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			studCount=Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		List<MyStudent> studList=new ArrayList<>();
			studList.add(new MyStudent(3, "a", "A", 100));	
			studList.add(new MyStudent(2, "b", "B", 50));	
			studList.add(new MyStudent(1, "c", "C", 200));
			
			for(MyStudent s:studList)
			{
				System.out.println("List "+s);
			}
			
			
	}

}
