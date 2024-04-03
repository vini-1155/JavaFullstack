package ANANTHA.REPOSITORIES;
import java.util.List;

import ANANTHA.ENTITIES.Student;
import ANANTHA.ENTITIES.Subject;

public interface SubjectDAO {
	public boolean createConnection()throws Exception ;
	public int insertSubject(Subject s);
	public int updateSubject(String subjectCode,Subject s);
	public int deleteSubject(String subjectCode);
	public List<Subject> fetchAllSubjects();
	public Subject fetchASubject(String subjectCode);
}