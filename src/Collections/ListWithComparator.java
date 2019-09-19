package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sort list with last digit
public class ListWithComparator {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(224);	
		list.add(221);
		list.add(226);
		list.add(222);
		
		/*Collections.sort(list);
		Collections.reverse(list);*/
		
		/*//unsorted list
		for(int i:list) {
			System.out.println(i);
		}*/
		
		Comparator<Integer> com=new ColImpl();
		Collections.sort(list, com);
		
		//unsorted list
				for(int i:list) {
					System.out.println("  "+i);
				}
		
	}

}
