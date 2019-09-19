package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
System.out.println("Enter choice 1.HAshMap or 2.HashTable-");
		
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
		//Prefered over hashtable
		//Nonsynchronised
		//no duplicate keys 
		//not thread safe
		Map<String,String> map=new HashMap<>();
		map.put("a","Praj");
		map.put("b","Neil");
		map.put("c","bhosale");
		map.put("a","Bhapkar");
		
		Set<String> keys=map.keySet();
		
		System.out.println("**Output for HAshMap**");
		for(String key:keys) {
			System.out.println(key+"  "+map.get(key));
		}
		
		break;
		
		case 2:
			//synchronised
			//no duplicate keys 
			// thread safe
			Map<String,String> map1=new HashMap<>();
			map1.put("a","Praj");
			map1.put("b","Neil");
			map1.put("c","bhosale");
			map1.put("a","Bhapkar");
			
			Set<String> keys1=map1.keySet();
			
			System.out.println("**Output for Hashtable**");
			for(String key:keys1) {
				System.out.println(key+"  "+map1.get(key));
			}
			
			break;

		default:
			System.out.println("****Invalid Selection-Either select 1 or 2****");
			break;
		}

		
		
		}
		
	}
