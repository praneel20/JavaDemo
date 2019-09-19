package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class ListInterface {

	public static void main(String[] args) {
		
		/*Collection<Integer> val=new ArrayList<>();		
		val.add(10);
		val.add(20);
		val.add(30);
		val.add(40);
		val.add(50);
		
		for(int i: val) {
			System.out.println("val => "+i);
		}
*/
		//to work with indexes we use List,set
		/*List<Integer> val=new ArrayList<>();
		val.add(10);
		val.add(100);
		val.add(30);
		val.add(40);
		val.add(50);
		
		val.add(2, 15);
		//val.remove(0);
		
		Collections.sort(val);
		val.forEach(System.out::println);
		*/
		
		//vector--dynamic array
		Vector<Integer> v=new Vector<>();
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(5);
		v.remove(1);
		for(int i:v)
		{
			System.out.println(i);
		}
		System.out.println("capacity-"+v.capacity());
	}

}
