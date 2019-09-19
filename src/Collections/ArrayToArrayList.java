package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String[] a= {"a","b","c"};
		int[] b= {1,2,3};
		
		//1.
		List<String> strList=new ArrayList<>();
		Collections.addAll(strList, a);
		System.out.println("1. "+strList);
		
		/*List<Integer> numList=new ArrayList<Integer>();
		Collections.addAll(numList, b);*/
		
		//2.
		List list=Arrays.asList(a);
		System.out.println("2. "+list);
		
		//3.
		List<String> newList=new ArrayList<>();
		for(String str:a) {
			newList.add(str);
		}
		System.out.println("3. "+newList);
		
	}

}
