package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;

	private List<Car> cars= new ArrayList<Car>();
	
	public void printCars()
	{
		for(Car c: cars)
		{
			c.printCar();
		}
	}
	
	public Person(String name, List<Car> cars) {
		super();
		this.name = name;
		this.cars = cars;
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
