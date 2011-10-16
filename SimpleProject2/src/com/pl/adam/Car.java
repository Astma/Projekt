package com.pl.adam;

public class Car {

	private String mark;
	private String register_number;
	
	public void printCar()
	{
		System.out.println("Mark: "+mark+"\nRegister Number: "+ register_number);
	}
	
	
	public Car(String mark, String reg_number)
	{
		this.mark=mark;
		this.register_number=reg_number;
	}
	
	public String getMark()
	{
		return this.mark;
	}
	
	public void setMark(String mark)
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
