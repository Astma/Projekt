package com.pl.adam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {

		Person p= new Person("Adam");
		
		p.addCar(new Car(CarMarks.BMW,"GDA1235"));
		p.addCar(new Car(CarMarks.Volvo,"GDA38721"));
		p.addCar(new Car(CarMarks.Peugot,"GDA37626"));
				
		p.printCars();
		
		System.out.println(p);
	}

}
