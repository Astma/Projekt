package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		List<Car> cars=new ArrayList<Car>();
		
		cars.add(new Car("BMW","GDA1235"));
		cars.add(new Car("Volvo","GDA38721"));
		cars.add(new Car("Alfa","GDA37626"));
		
		Person p= new Person("Adam",cars);
		
		p.printCars();
		
	}

}
