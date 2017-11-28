package com.cg.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//TODO 1 Import appropriate packages based on following TODOs

//PLEASE UPDATE THIS IMPLEMENTATION (REFER TODOS)
/**
 * 
 * This is a ServiceLocator class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */

/**
 * <code>ServiceLocator</code> encapsulates JNDI lookups to make it
 * easier to access JNDI-based resources (EJBs, DataSources,
 * JMS Destinations, and so on).
 *
 */
public class ServiceLocator {

    //TODO 2 Implement following Java Doc comment
	/**
     * Making the default (no arg) constructor private
     * ensures that this class cannnot be instantiated.  
     */
        
    
    /**
     * Gets a <code>DataSource</code> using the given JNDI name.
     *
     * @param dataSourceJndiName The <code>DataSource</code>'s JNDI name.
     *
     * @return DataSource The <code>DataSource</code>.
     *
     * @throws ServiceLocatorException If there are JNDI lookup problems.
     *
     * @see javax.sql.DataSource
     */
    public static DataSource getDataSource(String dataSourceJndiName) throws ServiceLocatorException {
        //TODO 3 declare a local variable dataSource of type DataSource and initialize it to null
		DataSource dataSource = null;

        try {
            Context ctx = new InitialContext();
            Context envContext  = (Context)ctx.lookup("java:/comp/env");
			//TODO 4 Use an API to look up the datasource 
			//using jndi name passed as a parameter to this method
			// and set the local variable dataSource in TODO 3
            dataSource = (DataSource)envContext.lookup(dataSourceJndiName);
            
        } catch (ClassCastException cce) {
            //TODO 5 wrap ClassCastException in ServiceLocatorException and throw
        	throw new ServiceLocatorException(cce);
        } catch (NamingException ne) {
            //TODO 6 wrap NamingException in ServiceLocatorException and throw
        	throw new ServiceLocatorException(ne);
        }
		
		//TODO 7 return dataSource
        return dataSource;
    }


   



}
