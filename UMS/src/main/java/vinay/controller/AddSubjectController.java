package vinay.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinay.entities.Subject;
import vinay.repositories.SubjectDAO;
import vinay.repositories.SubjectDAOImpl;
import vinay.services.SubjectService;


/**
 * Servlet implementation class AddStudentController
 */

public class AddSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private SubjectDAO subjectdao;
    private SubjectService subjectservice;
    private Subject ob;
    public AddSubjectController() {
       subjectdao=SubjectDAOImpl.returnInstance();
       subjectservice=new SubjectService(subjectdao);
       ob=new Subject(); 
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String subjectCode=request.getParameter("subcode");
		String subjectName=request.getParameter("n");
		int credit = Integer.parseInt(request.getParameter("c"));
		ob.setSubjectCode(subjectCode);ob.setSubjectName(subjectName);ob.setCredit(credit);
		subjectdao.createConnection();
		response.setContentType("text/html");
		response.getWriter().print("Connection Established");
		int r=subjectservice.insertSubject(ob);
		
		if(r==1)
		response.getWriter().print("<h2> subject inserted </h2> <br> <h4> Vinay M <br> 20201CSE0604 </h4>");
		else
			response.getWriter().print("<h2> error... </h2>");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}