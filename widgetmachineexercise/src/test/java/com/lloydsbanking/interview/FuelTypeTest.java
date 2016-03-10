package com.lloydsbanking.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuelTypeTest {

	@Test 
	public void enumElementIsFoundWhenExistsInArray () {
		FuelType[] fuelTypes = {FuelType.DIESEL, FuelType.PETROL};
		assertTrue("DIESEL is contained", FuelType.DIESEL.isContainedIn(fuelTypes));
	}
	
	@Test 
	public void enumElementIsNotFoundWhenDoesNotExistInArray () {
		FuelType[] fuelTypes = {FuelType.DIESEL, FuelType.PETROL};
		assertFalse("WOOD is not contained", FuelType.WOOD.isContainedIn(fuelTypes));
	}
}
