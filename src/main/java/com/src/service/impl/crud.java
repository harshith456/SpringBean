package com.src.service.impl;
import java.sql.*;
import com.src.service.CrudOperation;
public class crud implements CrudOperation{
	DBConnection db;
	Connection con;
	Statement stmt;
	
	crud(){
		db = new DBConnection();
	}
	
	public void create(String query){
		
		con = db.dbConnect();
		if(con!=null){
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void insert(String query){
		con = db.dbConnect();
		if(con!=null){
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void delete(String query){
		con = db.dbConnect();
		if(con!=null){
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void selectvalues() throws ClassNotFoundException {
		
		con = db.dbConnect();
		if(con!=null){
			try{
				stmt = con.createStatement();
			    
				String sql = "SELECT * FROM HARSHITH" ;
				ResultSet rs = stmt.executeQuery(sql); 

				while(rs.next()){
			        
			        int id  = rs.getInt("id");
			     
			        String name = rs.getString("name");
			        

			        
			        System.out.print("ID:" + id + " Name:" +name);
			        System.out.println("\n");
			       
			        		        
				}
			    
				}
				catch(SQLException se){
					   
				    se.printStackTrace();
				 }
			finally{
				try {
					con.close();
				} catch (SQLException e) { 
					e.printStackTrace();
				}
			}
		}
		
		
	}
	

}
