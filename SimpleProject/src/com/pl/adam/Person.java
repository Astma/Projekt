package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	public String name;
	
	public List<Car> cars= new ArrayList<Car>();
	
	public Person(String name, List<Car> cars)
	{
		this.name=name;
		this.cars=cars;
	}
	
	public void printCars()
	{
		for(Car c : cars)
		{
			c.printCar();
		}
	}

}
