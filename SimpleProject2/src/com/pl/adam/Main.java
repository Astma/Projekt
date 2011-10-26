package com.pl.adam;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class Main {

	private static Logger logger= Logger.getLogger(Main.class);
	
	public static void main(String[] args) {

	 PropertyConfigurator.configure("Log4J.properties");
		
		
		Person p= new Person("Adam");
		
		p.addCar(new Car(CarMarks.BMW,"GDA1235"));
		p.addCar(new Car(CarMarks.Volvo,"GDA38721"));
		p.addCar(new Car(CarMarks.Peugot,"GDA37626"));
				
		p.printCars();
		
		Car c =new Car(CarMarks.BMW,"GDA1235");
		
		try {
			c.setPrize(-2.0);
		} catch (MyException e) {
			
			logger.error(e);
			logger.fatal(e);
			logger.info(e);
			logger.warn(e);
		}
		
		System.out.println(p);
	}

}
