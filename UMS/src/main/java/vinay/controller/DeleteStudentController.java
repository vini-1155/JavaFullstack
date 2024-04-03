package vinay.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinay.entities.Student;
import vinay.repositories.StudentDAO;
import vinay.repositories.StudentDAOImpl;
import vinay.services.StudentService;

/**
 * Servlet implementation class DeleteStudentController
 */
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO studentdao;
    private StudentService studentservice;
    @SuppressWarnings("unused")
	private Student ob;
    public DeleteStudentController() {
       studentdao=StudentDAOImpl.returnInstance();
       studentservice=new StudentService(studentdao);
       ob=new Student(); 
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int id=Integer.parseInt(request.getParameter("id"));
		studentdao.createConnection();
		response.setContentType("text/html");
		response.getWriter().print("Connection Established");
		int r=studentservice.deleteStudent(id);
		
		if(r==1)
		   response.getWriter().print("<h2> student Deleted <br> Vinay M <br> 20201CSE0604  </h2>");
		else
			response.getWriter().print("<h2> error...</h2>");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
