package com.src.service.impl;

public class MainClass {
	public static void main(String args[]){
		crud db = new crud();
		String insertQuery;
		
		String dropQuery="DROP TABLE IF EXISTS HARSHITH;";
		db.insert(dropQuery);
		
		String createQuery;
		createQuery = "CREATE TABLE HARSHITH " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " + 
                " PRIMARY KEY ( id ));";
		db.create(createQuery);
		
		insertQuery = "INSERT INTO HARSHITH " +
          		"VALUES (1,'Harshith');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO HARSHITH " +
                "VALUES (2,'Samith');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO HARSHITH " +
                "VALUES (3,'Shrey');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO HARSHITH " +
                "VALUES (4,'Shrinidhi');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO HARSHITH " +
                "VALUES (5,'Praveen');";
		db.insert(insertQuery);
		try {
			db.selectvalues();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
