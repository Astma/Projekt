package com.pl.adam.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.pl.adam.projectfiles.Car;
import com.pl.adam.projectfiles.CarMarks;
import com.pl.adam.projectfiles.MyException;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testAddCar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testPrintCars() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testPerson() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testDeleteCar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testEditCar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindCar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	@Ignore
	public void testGetCars() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetCars() {
		fail("Not yet implemented"); // TODO
	}

	@Test(expected=MyException.class, timeout=100)
	public void testException() throws MyException 
	{
		new Car(CarMarks.AlfaRomeo,"").setPrize(-8.0);
	}
}
