package mapp;
import java.util.*;
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> table1 = new HashMap<Integer, String>();
		Map<Integer, String> table2 = new HashMap<Integer, String>();
		table1.put(1, "Vinay");
		table1.put(2, "Vinay");
		table1.put(3, "Vinay");
		table1.put(4, "Vinay");
		table1.put(5, "Vinay");
		table1.put(65, "Vinay");
		
		table2.putAll(table1);
		table2.put(2,"Devang");
		table2.putIfAbsent(3, "Yesh");
		table2.putIfAbsent(4, "Yesh");
		table2.putIfAbsent(56, "Yesh");
		
		System.out.println("The table1 : "+table1);
		System.out.println("The table1 : "+table2);
		
		for(Map.Entry<Integer, String> e: table2.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
		
		Set<Integer> keys = table1.keySet();
		System.out.println("The Keys are : "+keys);
		
//		displaying all the tables
		
		Collection<String> values = table1.values();
		System.out.println("The values are "+ values);
		
		String v = table1.get(1);
		System.out.println("To array keys "+ v);
		
		String v1 = table1.getOrDefault(99,"Ram");
		System.out.println("To array keys "+ v1);
		
		System.out.println("Remove");
		
		table2.remove(1);
		
		for(Map.Entry<Integer, String> e: table2.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		System.out.println("Replace");
		table2.replace(65,"Devang");
		
		for(Map.Entry<Integer, String> e: table2.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
		table1.compute(1, (key, value)-> value.concat("Singh"));
		
		System.out.println("Compute");
		
		for(Map.Entry<Integer, String> e: table2.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
	}

}
