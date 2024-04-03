package vinay.services;
import java.util.List;

import vinay.entities.Subject;
import vinay.repositories.SubjectDAO;


public class SubjectService {
	//@Autowired  later
	//Explicit wiring StudentRepository with StudentService
	private SubjectDAO subjectdao;
   public SubjectService(SubjectDAO subjectdao) {
		this.subjectdao = subjectdao;
	}
public int insertSubject(Subject s) {
	int res=0;
	  res = subjectdao.insertSubject(s);
	  System.out.println(res);
	   return res;
   }
   public int updateSubject(String subjectCode, Subject s) {
	 int res = subjectdao.updateSubject(subjectCode, s);
	   return res;
   }
   public int deleteSubject(String subjectCode) {
	   int res = subjectdao.deleteSubject(subjectCode);
	   return res;
   }
   public List<Subject> fetchAllSubjects() {
	  List<Subject> list=subjectdao.fetchAllSubjects();
	   return list;
   }
}