package com.pl.adam;

public class Car {

	private CarMarks mark;
	
	private String register_number;
	
	public void printCar()
	{
		System.out.println("Mark: "+mark+"\nRegister Number: "+ register_number);
	}
	
	
	public Car(CarMarks mark, String reg_number)
	{
		this.mark=mark;
		this.register_number=reg_number;
	}
	
	public CarMarks getMark()
	{
		return this.mark;
	}
	
	public void setMark(CarMarks mark)
	{
		this.mark=mark;
	}
	
	public String getRegNumber()
	{
		return this.register_number;
	}
	public void setRegNumber(String reg_number)
	{
		this.register_number=reg_number;
	}
	
}
