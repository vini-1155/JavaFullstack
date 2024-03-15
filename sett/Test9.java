package sett;

import java.util.*;


class Subject{
	
	private int subjectCode;
	private String subjectName;
	private double subjectGrade;
	public Subject(int subjectCode, String subjectName, double subjectGrade) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectGrade = subjectGrade;
	}
}

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Subject> list = new ArrayList<>();
				list.add(new Subject(101, "Java", 3.0));
				list.add(new Subject(102, "Python", 4.0));
				list.add(new Subject(103, "C", 5.0));
				list.add(new Subject(104, "C++", 4.0));
				list.add(new Subject(105, "nodejs", 3.0));
				
		
		Map<Integer, List<Subject>> map = new HashMap<Integer, List<Subject>>(); 
		map.put(201, list);
		map.put(202, list);
		map.put(203, list);
		map.put(204, list);
		map.put(205, list);
		
		
		
		System.out.println(map);
		
		
		
	}

}
