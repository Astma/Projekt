package com.pl.adam.projectfiles;

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
	
	
	
	public void usunGre(String nazwa) {
		int pozycja = 0;
		for (Car game : cars) {
			if (game.getMark().equals(nazwa)) {
				cars.remove(pozycja);
				logger.info("Usuniêto auto " + nazwa);
				break;
			}
			pozycja++;
		}
	}



	public void edytujGre(CarMarks nazwa, double cenaNowa) throws MyException {
		int pozycja = 0;
		for (Car car : cars) {
			if (car.getMark().equals(nazwa)) {
				if (cenaNowa >0)
				{
					cars.set(pozycja, new Car(nazwa, cenaNowa));
					logger.info("Edytowano auto " + nazwa + " cena zmieniona z " + car.getPrize() + " na " + cenaNowa);
				}
				if (cenaNowa<=0)
					throw new MyException("Edytowana cena nie mo¿e byæ poni¿ej zera");
				break;
			}
			pozycja++;
		}
	}

	public void findCar(CarMarks mark) {
		int pozycja = 0;
		for (Car game : cars) {
			if (game.getMark().equals(mark)) {
				System.out.println("jakies smieci na pozycji "+ pozycja);
			}
			pozycja++;
		}
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
