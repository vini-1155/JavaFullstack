package listt;

import java.util.*;
import java.util.stream.Collectors;

class Books{
	private String bookName;
	private int bookId;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Books(String bookName, int bookId) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
	}
	public Books() {
		super();
	}
	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", bookId=" + bookId + "]";
	}
	
	
}
class Student{
	private int id;
	private String name;
	private double fine;
	private Books book;
	private int norofdays;
	
	public int getNorofdays() {
		return norofdays;
	}
	public void setNorofdays(int norofdays) {
		this.norofdays = norofdays;
	}
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
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public Student(int id,String name, Books book) {
		super();
		this.name = name;
		this.id = id;
		this.book = book;
	}
	public Student() {
		super();
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", fine=" + fine + ", book=" + book + ", norofdays=" + norofdays
//				+ ", getNorofdays()=" + getNorofdays() + ", getId()=" + getId() + ", getName()=" + getName()
//				+ ", getFine()=" + getFine() + ", getBook()=" + getBook() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fine=" + fine + ", book=" + book + ", norofdays=" + norofdays
				+ "]";
	}
//	Sort by id
//@Override
//public int compareTo(Student o) {
//	// TODO Auto-generated method stub
//	return Integer.compare(this.id, o.id);
//}
// Sort by name
//@Override
//public int compareTo(Student o) {
//	// TODO Auto-generated method stub
//	return this.name.compareTo(o.name);
//}
//		
	
}

//class idComapator implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o1.getId(), o2.getId());
//	}
//	
//}
//
//class idComapatorDesc implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o2.getId(), o1.getId());
//	}
//	
//}
//
//class nameComapator implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}
//
//class nameComapatorDesc implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o2.getName().compareTo(o1.getName());
//	}
//	
//}
//
//class fineComapator implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Double.compare(o1.getFine(), o2.getFine());
//	}
//	
//}
//
//class fineComapatorDesc implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Double.compare(o2.getFine(), o1.getFine());
//	}
//	
//}
//
//class dayComapator implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o1.getNorofdays(), o2.getNorofdays());
//	}
//	
//}
//
//class dayComapatorDesc implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o2.getNorofdays(), o1.getNorofdays());
//	}
//	
//}




public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b1 = new Books("Harry Potter", 201);
		Books b2= new Books("Harry Potter", 202);
		Books b3 = new Books("Harry Potter", 203);
		Books b4 = new Books("Harry Potter", 204);
		Books b5 = new Books("Harry Potter", 205);
		Books b6 = new Books("Harry Potter", 206);
		
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student(106,"Yesh",b1);
		Student s2 = new Student(102,"Vinay",b2);
		Student s3 = new Student(103,"Manju",b3);
		Student s4 = new Student(104,"Amith",b4);
		Student s5 = new Student(105,"Grii",b5);
		Student s6 = new Student(101,"Manii",b6);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Vector v = new Vector();
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		v.add(s5);
		v.add(s6);
		int norOfDays = 0;
		double fine = 0;

//		for(Student st: list) {
//			System.out.println("Enter the number of days");
//			norOfDays = sc.nextInt();
//			st.setNorofdays(norOfDays);
//			if(norOfDays>30) {
//				fine = (norOfDays%30) *5;	
//				st.setFine(fine);
//			}
//		}
		
		System.out.println("Enter the number of days");
		list.stream().forEach(e->System.out.println(e));
		
//		Student std = new Student();
//		std.setName("Grii");
		
		Collections.sort(list,(f,s)->Integer.compare(f.getId(), s.getId()));
		System.out.println("\nSorting by ID\n");
		list.stream().forEach(e->System.out.println(e));
		
		Collections.sort(list,(f,s)->Integer.compare(s.getId(), f.getId()));
		System.out.println("\nSorting by ID desc\n");
		list.stream().forEach(e->System.out.println(e));
		
		Collections.sort(list,(f,s)->f.getName().compareTo(s.getName()));
		System.out.println("\nSorting by Name \n");
		list.stream().forEach(e->System.out.println(e));
		
		Collections.sort(list,(f,s)->s.getName().compareTo(f.getName()));
		System.out.println("\nSorting by Name desc\n");
		list.stream().forEach(e->System.out.println(e));
		
		
		Collections.sort(list,(f,s)->Integer.compare(f.getNorofdays(), s.getNorofdays()));
		System.out.println("\nSorting by Days\n");
		list.stream().forEach(e->System.out.println(e));
		
		Collections.sort(list,(f,s)->Integer.compare(s.getNorofdays(), f.getNorofdays()));
		System.out.println("\nSorting by Days desc\n");
		list.stream().forEach(e->System.out.println(e));
		
//		int index = Collections.binarySearch(list, std,new nameComapatorDesc());
//		System.out.println("The student is in index : "+(index+1));
		
		List<Student> stdlist =new ArrayList<Student>();
		
		stdlist = list.stream()
				.filter(x->x.getName().equalsIgnoreCase("Vinay")&& x.getNorofdays()>30)
					.collect(Collectors.toList());
		
		System.out.println("\nThe Details is :");
		stdlist.stream().forEach(e->System.out.println(e));
		
//		double totalsalary = list.stream().reduce(0, (sum.x)) -> totalsalary+ x.getNorofdays();
	}

}

