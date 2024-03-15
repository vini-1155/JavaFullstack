package mapp;
//Students of 8sec1 are assigned with 5 sub
//Each sub is alloted to more than one faculty
//Each faculty is also assigned ti ither courses
//for other sections 
//each sub have 3 diff assessment for evalution

//find each student total mark in very subject
//Find the assigned faculty for every student
//find the details of the faculty and their course
import java.util.*;

class Student{
	private int studentId;
	private String name;
	private String address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int studentId, String name, String address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + "]";
	}	
	
	
}

class Course{
	private String cid;
	private String cname;
	private String ctype;
	private String domain;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public Course(String cid, String cname, String ctype, String domain) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
		this.domain = domain;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ctype=" + ctype + ", domain=" + domain + "]";
	}
	
	
	
}

class Faculty{
	private int empid;
	private String fname;
	private String qualification;
	private String designation;
	private List<Course> courses;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Faculty(int empid, String fname, String qualification, String designation, List<Course> courses) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.qualification = qualification;
		this.designation = designation;
		this.courses = courses;
	}
	public Faculty() {
		super();
	}
	@Override
	public String toString() {
		return "Faculty [empid=" + empid + ", fname=" + fname + ", qualification=" + qualification + ", designation="
				+ designation + ", courses=" + courses + "]";
	}
	
}

class Subject{
	private String subjectCode;
	private String subjectName;
	private int credit;
	private int marks[];
	private List<Faculty> faculties;
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public List<Faculty> getFaculties() {
		return faculties;
	}
	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}
	public Subject(String subjectCode, String subjectName, int credit, int[] marks, List<Faculty> faculties) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
		this.marks = marks;
		this.faculties = faculties;
	}
	public Subject() {
		super();
	}
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit
				+ ", marks=" + Arrays.toString(marks) + ", faculties=" + faculties + "]";
	}
	
}


public class Test11 {
	
	public static void main(String [] args) {
		Map<Student, List<Subject>> table = new HashMap<>();
		
		Student s1 = new Student(101, "Ram", "Banglore");
		Student s2 = new Student(102, "Sham", "mysore");
		Student s3 = new Student(103, "birble", "Dubai");
		Student s4 = new Student(104, "raju", "kerala");
		Student s5 = new Student(105, "akbar", "pondi");
		Student s6 = new Student(106, "bheem", "HYD");
		Student s7 = new Student(107, "Nyra", "Udupi");
		Student s8 = new Student(108, "Chutki", "hampi");
		Student s9 = new Student(109, "Raj", "kolar");
		Student s10 = new Student(110, "arpita", "Blore");
		Student s11 = new Student(112, "Siddu", "goa");
		Student s12 = new Student(113, "kumar", "Gujurat");
		Student s13 = new Student(114, "mohan", "rajasthan");
		Student s14 = new Student(115, "Pathan", "bihar");
		Student s15 = new Student(116, "yogaraj", "assam");
		
		
		Course c1 = new Course("CSE3204","Java-Full Stack","Itegrated", "Cse");
		Course c2 = new Course("CSE502","Technical Skills in java ","Theory", "Cse");
		Course c3 = new Course("CSE3002","Big Data","Itegrated", "Cse");
		Course c4 = new Course("CSE3003","IOT","Itegrated", "Cse");
		Course c5 = new Course("CSE3167","Compiler design","Theory", "Cse");
		Course c6 = new Course("CSE2010","Operating System","Itegrated", "Cse");
		Course c7 = new Course("CSE2011","DCCN","Theory", "Cse");
		Course c8 = new Course("CSE3212","DBMS","Itegrated", "Cse");
		Course c9 = new Course("CSE2021","Data Mining","Theory", "Cse");
		Course c10 = new Course("CSE2066","Computer Graphics","Theory", "Cse");
		Course c11 = new Course("CSE2067","Web TEchnologies","Itegrated", "Cse");
		Course c12 = new Course("CSE2007","DAA","Itegrated", "Cse");
		Course c13 = new Course("CSE3008","Java Programming","Itegrated", "Cse");
		Course c14 = new Course("CSE2009","COA","Theory", "Cse");
		Course c15 = new Course("CSE2017","Graph Thoery","Theory", "Cse");
		Course c16 = new Course("CSE3006","AI&NN","Theory", "Cse");
		Course c17 = new Course("MIT105","Calcus Algebra","Theory", "Cse");
		Course c18 = new Course("CHE1001","Eng Chemistry","Theory", "Cse");
		Course c19 = new Course("ECE101","Electronics","Theory", "Cse");
		Course c20 = new Course("MEC101","Elements of mech","Theory", "Cse");
		
		List<Course> listofcourses = new ArrayList<>();
		listofcourses.add(c1);
		listofcourses.add(c2);
		listofcourses.add(c3);
		listofcourses.add(c4);
		listofcourses.add(c5);
		listofcourses.add(c6);
		listofcourses.add(c7);
		listofcourses.add(c8);
		listofcourses.add(c9);
		listofcourses.add(c10);
		listofcourses.add(c12);
		listofcourses.add(c13);
		listofcourses.add(c14);
		listofcourses.add(c15);
		listofcourses.add(c16);
		listofcourses.add(c17);
		listofcourses.add(c18);
		listofcourses.add(c19);
		listofcourses.add(c20);
		
		List<Faculty> faculties = new ArrayList<>();
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		faculties.add(new Faculty(201,"Dr. Gopal Krishna Shyam", "Phd", "Hod", listofcourses));
		
		
		
		int marks[] = {14, 15,15,17,67,89};
//		Subject sub1 = new Subject("CSE1001","Java Full Stack",3,marks, );
		
		
	}

}
