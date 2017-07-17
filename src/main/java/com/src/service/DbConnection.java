package com.src.service;
import java.sql.Connection;
public interface DbConnection {
	public void registerConnection();
	public Connection makeConnection();

}
