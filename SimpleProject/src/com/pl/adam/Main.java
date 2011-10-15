package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Car> cars= new ArrayList<Car>();
		
		cars.add(new Car("BMW","GDA1234"));
		cars.add(new Car("Valvo","GDA23445"));
		cars.add(new Car("Alfa","gda6790"));
		
		Person p=new Person("Adam",cars);
		
		p.printCars();
	}

}
