package com.cg.beans;

import java.io.Serializable;

//PLEASE UPDATE THIS IMPLEMENTATION (REFER TODOS)
/**
 * 
 * This is a CarDTO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class CarDTO implements Serializable
{
    private int id;
    private String make;
    private String model;
    private String modelYear;

    public CarDTO()
    {
        //TODO 1 initialize id to -1 and rest of the member variables to a blank string
		id = -1;
		make = model = modelYear = "Not Specified";
    }

    //TODO 2 Implement the setter and getter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
}