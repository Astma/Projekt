package com.pl.adam;

public class Car {

	private String mark;
	private String reg_number;
	
	public Car(String mark, String reg_number)
	{
		this.mark=mark;
		this.reg_number=reg_number;
	}

	public void printCar()
	{
		System.out.println("Matrka: "+mark+"\n Register no: "+ reg_number);
	}
	
	public String getMark()
	{
		return this.mark;
	}
	
	public void setMark(String mark)
	{
		this.mark=mark;
	}
	
	public String getRegisterNumber()
	{
		return this.reg_number;
	}
	
	public void setRegisterNumber(String reg_number)
	{
		this.reg_number=reg_number;
	}
	
}
