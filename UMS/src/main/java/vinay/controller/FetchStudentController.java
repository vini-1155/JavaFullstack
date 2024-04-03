package vinay.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinay.entities.Student;
import vinay.repositories.StudentDAO;
import vinay.repositories.StudentDAOImpl;
import vinay.services.StudentService;

/**
 * Servlet implementation class FetchStudentController
 */
public class FetchStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO studentdao;
    private StudentService studentservice;
    @SuppressWarnings("unused")
	private Student ob;
    public FetchStudentController() {
       studentdao=StudentDAOImpl.returnInstance();
       studentservice=new StudentService(studentdao);
       ob=new Student(); 
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		studentdao.createConnection();
		response.setContentType("text/html");
		response.getWriter().print("Connection Established <br>");
		
		List<Student> r=studentservice.fetchAllStudents();
		
		   response.getWriter().print(r+"<br>  <h2> student Details <br> Pathan <br> 20201CST0058 </h2>");
		   System.out.println(r);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
