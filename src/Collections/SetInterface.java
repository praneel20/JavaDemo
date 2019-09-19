package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		System.out.println("Enter choice 1.HashSet or 2.TreeSet-");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int ch=0;
		try {
			ch = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (ch) {
		case 1:
			
			//1.no duplicates'
			//2.not sequential coz of hashset(i.e. hashing concept)
			
			Set<Integer> values=new HashSet<>();
			values.add(10);
			values.add(8);
			values.add(5);
			values.add(20);
			values.add(10);
			
			System.out.println("**Output for HashSet**");
			for(int i:values) {
				System.out.println(i);
			}
			
			break;
		
		case 2:
			
			/***treeSet()***/
			//1.no duplicates
			//2.returns sorted values
					
				Set<Integer> values1=new TreeSet<>();
					values1.add(10);
					values1.add(8);
					values1.add(5);
					values1.add(20);
					values1.add(10);
			
			System.out.println("**Output for TreeSet**");
			for(int i:values1) {
				System.out.println(i);
			
			}
			
			break;

		default:
			System.out.println("****Invalid Selection-Either select 1 or 2****");
			break;
		}

}
}
