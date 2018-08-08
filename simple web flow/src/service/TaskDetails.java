package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controller.DBConnection;

import Model.TaskActivity;

public class TaskDetails {
	private Statement statement = null;
	private ResultSet resultSet = null;
	private Connection connect = null;	
	private PreparedStatement preparedStatement = null;	
	private List<TaskActivity> task;
	private List<TaskActivity> activity;
	public TaskDetails() {
		// TODO Auto-generated constructor stub
	}

	/*public List<TaskActivity> readDataAccess(Statement statement) {
		
		List<TaskActivity> prj = new ArrayList<TaskActivity>();
		int i = 0;
		try {
			resultSet = statement
					.executeQuery(TaskSqlConstants.GET_TASK);
			while(resultSet.next()){
				TaskActivity td = new TaskActivity();
				if(i<=5){
					System.out.println("Data from db i column****"+resultSet.getInt("project_id"));					
					td.setPrj(resultSet.getInt("project_id"));	
					prj.add(td);
			}
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prj;
		
		
	}*/
	
	public List<TaskActivity> getTask() {
		
		List<TaskActivity> r = new ArrayList<TaskActivity>();
		int i = 0;
		connect = DBConnection.connect(true);
		try {
			statement = connect.createStatement();
			resultSet = statement
					.executeQuery(TaskSqlConstants.GET_TASK);
			while(resultSet.next()){
				TaskActivity td = new TaskActivity();
				if(i<=5){
					System.out.println("Data from db i column****"+resultSet.getInt("project_id"));					
					td.setTask(resultSet.getInt("project_id"));	
					r.add(td);
			}
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
		
		
	}
	
	
public List<TaskActivity> getActivity() {
		
		List<TaskActivity> r = new ArrayList<TaskActivity>();
		int i = 0;
		connect = DBConnection.connect(true);
		try {
			statement = connect.createStatement();
			resultSet = statement
					.executeQuery(TaskSqlConstants.GET_ACTIVITY);
			while(resultSet.next()){
				TaskActivity td = new TaskActivity();
				if(i<=5){
					System.out.println("Data from db i column****"+resultSet.getString("user_in"));					
					td.setActivites(resultSet.getString("user_in"));	
					r.add(td);
			}
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
		
		
	}
	
	/**
	 * @param args
	 */
	

}
