package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Person {
	private PropertyConfigurator logConfig = new PropertyConfigurator();
	private Logger logger=Logger.getLogger(Person.class);
	
	private String name;

	private List<Car> cars= new ArrayList<Car>();
	
	public String toString()
	{
		return name + " has " + cars.size()+" cars.";
	}
	
	public void addCar(Car c)
	{
		cars.add(c);
		logConfig.configure("Log4J.properties");
		logger.info("Car " + c + "Had been added to " + this);
	}
	
	public void printCars()
	{
		for(Car c: cars)
		{
			c.printCar();
		}
	}
	
	public Person(String name) {
		super();
		this.name = name;
		this.cars = new ArrayList<Car>();
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
