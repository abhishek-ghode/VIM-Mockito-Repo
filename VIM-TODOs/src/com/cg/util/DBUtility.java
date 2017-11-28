package com.cg.util;

import com.cg.dao.CarDAO;
import com.cg.dao.impl.JDBCCarDAO;

//TODO 1 Import appropriate packages based on TODOs 2 and 3

//PLEASE UPDATE THIS IMPLEMENTATION (REFER TODOS)
/**
 * 
 * This is a DBUtility class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class DBUtility {
	
	//TODO 2 Declare a static reference dao of type CarDAO pointing to JDBCCarDAO instance
	private static CarDAO carDAO = new JDBCCarDAO();
	
	
	/**
	 * @return	CarDAO a factory for creating DAO 
	 */
	 //TODO 3 Implement a method getCarDAO which returns dao created in TODO 1
	public static CarDAO getCarDAO() {
		return carDAO;
	}
	
}
