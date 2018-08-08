package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.TaskActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import service.TaskDetails;

/**
 * Servlet implementation class Initial
 */
public class Initial extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	int i =0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Initial() {
        super();        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		connect = DBConnection.connect(true);
		System.out.println("Connection***"+connect);		
		/*try {
			statement = connect.createStatement();
			TaskDetails hr = new TaskDetails();
			List<TaskActivity> rt = new ArrayList<TaskActivity>();
			rt = hr.readDataAccess(statement);					
			request.setAttribute("Project_id", rt);
			request.getRequestDispatcher("hour_details.jsp").forward(request, response);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("Entered into the controller");	*/	
		   
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
