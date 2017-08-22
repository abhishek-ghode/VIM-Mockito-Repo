package com.cg;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cg.beans.CarDTO;
import com.cg.dao.CarDAO;

public class TestControllerServlet {

	@Mock
	private CarDAO daoRef;
	
	@InjectMocks
	private ControllerServlet myServlet; 
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this);
//		Mock CarDAO

//		daoRef = Mockito.mock(CarDAO.class);
		
		System.out.println(daoRef.getClass());
		
	}

	
	/*
	 * We need to get list of cars when findAll() operation is invoked on
	 * CarDAO; provided user selects an action 'viewCarList'
	 * 
	 * 
	 */

	@Test
//	@Ignore
	public void testProcessRequest() throws ServletException, IOException {
//		fail("Not yet implemented");
		
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class); 
	
//		WHEN-THEN PATTERN
		Mockito.when(request.getParameter("action")).thenReturn("viewCarList");

		
		
		
		
		
		
		
		//		DATA FIXTURE
		List<CarDTO> cars = new LinkedList<>();
		CarDTO car = new CarDTO();
		
		car.setId(1);		
		car.setMake("Honda");
		car.setModel("City");
		car.setModelYear("2015");;
		cars.add(car);
		
//		WHEN-THEN PATTERN
		Mockito.when(daoRef.findAll()).thenReturn(cars);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ControllerServlet myServlet = new ControllerServlet();
		myServlet.setCarDAO(daoRef);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		EXECUTION
		myServlet.processRequest(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		VERIFICATION
		Mockito.verify(request).getParameter("action");
		Mockito.verify(daoRef).findAll();
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
