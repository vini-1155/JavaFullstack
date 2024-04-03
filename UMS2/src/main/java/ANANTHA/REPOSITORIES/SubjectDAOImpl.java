package ANANTHA.REPOSITORIES;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ANANTHA.ENTITIES.Student;
import ANANTHA.ENTITIES.Subject;
public class SubjectDAOImpl implements SubjectDAO {
	private static SubjectDAOImpl ob=null;
	private Connection contodb=null;
	private SubjectDAOImpl() {}
	public static SubjectDAOImpl returnInstance() {
		if(ob==null)
			ob=new SubjectDAOImpl();
		return ob;
	}
	public boolean createConnection()throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		contodb=DriverManager.getConnection("jdbc:mysql://localhost:3306/8CSE","root","root");
		
		if(contodb!=null)
			return true;
		else
			return false; 
	}
	public int insertSubject(Subject s) {
		int response=0,response2=0;
		try {
		PreparedStatement ps=contodb.prepareStatement("insert into subject values(?,?,?)");
		//before doing this insert subject in subject table
		ps.setString(1, s.getSubjectCode());
		ps.setString(2, s.getSubjectName());
		ps.setInt(3, s.getCredit());
		response=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		if(response==1 )
		return 1;
		else return 0;
	}
	public int updateSubject(String subjectCode,Subject s) {
		int response=0;
		try {
		PreparedStatement ps=contodb.prepareStatement(
				"update subject set subname=?,credit=? where subcode=? ");
		ps.setString(1, s.getSubjectName());
		ps.setInt(2, s.getCredit());
		ps.setString(3, subjectCode);
		response=ps.executeUpdate();
		}catch(Exception e) {}
		return response;
	}
	public int deleteSubject(String subjectCode) {
		int response=0,response2=0;
		try {
		PreparedStatement ps=contodb.prepareStatement(
				"delete from subject where where subcode=? ");
		PreparedStatement ps2=contodb.prepareStatement(
				"delete from enrollment where where subcode=? ");
		ps.setString(1, subjectCode);
		ps2.setString(1, subjectCode);
		response=ps.executeUpdate();
		response2=ps2.executeUpdate();
		}catch(Exception e) {}
		if(response==1 && response2==1)
			return 1;
		else return 0;
	}
	public List<Subject> fetchAllSubjects(){
		List<Subject> subjectsFetched=new ArrayList<Subject>();
		try {
			PreparedStatement ps=contodb.prepareStatement(
					"select * from subject ");
			ResultSet rs=ps.executeQuery();
			Subject s=new Subject();
			while(rs.next()) {
			s.setSubjectCode(rs.getString(1));
			s.setSubjectName(rs.getString(2));
			s.setCredit(rs.getInt(3));
			subjectsFetched.add(s);
			}
			}catch(Exception e) {}
		return subjectsFetched;
	}
	public Subject fetchASubject(String subjectCode) {
		Subject subjectFetched=new Subject();
		try {
			PreparedStatement ps=contodb.prepareStatement(
					"select * from subject where subcode=? ");
			ps.setString(1, subjectCode);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				subjectFetched.setSubjectCode(rs.getString(1));
				subjectFetched.setSubjectName(rs.getString(2));
				subjectFetched.setCredit(rs.getInt(3));
			}
			}catch(Exception e) {}
		return subjectFetched;
	}
}

