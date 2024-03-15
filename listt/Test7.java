package listt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	private String address;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int id, String name, double salary, String address, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", designation=" + designation + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
		
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//
		
		Employee obj = new Employee(100,"Vinaym",10000.00, "Banglore","Developer");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(100,"Vinay",10000.00, "Banglore","Developer"));
		list.add(new Employee(100,"Vin",100.00, "Bangl","Devel"));
		list.add(new Employee(00,"nay",100.00, "glore","loper"));
		list.add(new Employee(11,"Viay",30000.00, "west Banglore","Developer"));
		list.add(new Employee(100,"Reddy",10000.00, "North Banglore","Developer"));
		list.add(new Employee(110,"Mohan",10000.00, "Banglore","osser"));
		list.add(new Employee(111,"Prakash",10000.00, "Banglore","Dev"));
		list.add(list.size(),obj);
		
//		list.stream().forEach(e->{System.out.println(e);});
//		
//		ListIterator<Employee> itr = list.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		

//		list.add(list.size(), new Employee(111,"Subman",10000.00, "Banglore","Dev"));
		
//		System.out.println("Employee subman is inserted");
//		for(Employee e:list) {
//			System.out.println(e);
//		}
//		System.out.println(list.size());
		
//		int ind = list.indexOf(new Employee(100,"Vinay",10000.00, "Banglore","Developer"));
//		
//		System.out.println(ind);
//		list.remove(ind + list.size());
//				
//		System.out.println("Employee Vin is Deleted");
		
		for(Employee e:list) {
			System.out.println(e);
		}
		
		System.out.println(list.size());
		
		if(list.contains(obj)) {
			System.out.println("Employee is Present");
			
		}else {
			System.out.println("Employee is not Present");
		}
		Collections.sort(list);
		list.stream().forEach(o->System.out.println(o));
	}

}
