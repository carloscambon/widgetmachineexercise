package com.lloydsbanking.interview;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SteamEngineTest {
	
	SteamEngine woodSteamEngine;
	SteamEngine coalSteamEngine;
	
	@Before
	public void setup() {
		
		woodSteamEngine = new SteamEngine(FuelType.WOOD);
		woodSteamEngine.fill(FuelType.WOOD, 100);
		woodSteamEngine.start();
		
		coalSteamEngine = new SteamEngine(FuelType.COAL);
		coalSteamEngine.fill(FuelType.COAL, 100);
		coalSteamEngine.start();

	}

	@Test
	public void batchSizeOfSteamEngineIs2() {
		
		assertEquals("incorrect Batch size for Steam Engine of WOOD", 2,
				woodSteamEngine.getBatchSize());

		assertEquals("incorrect Batch size for Steam Engine of COAL", 2,
				coalSteamEngine.getBatchSize());

	}

	@Test
	public void batchCostOfSteamEngineOfWoodIs4_35() {
		
		assertEquals("incorrect Batch cost for Steam Engine of WOOD", 4.35f,
				woodSteamEngine.getBatchCost(), 0f);
		
	}

	@Test
	public void batchCostOfanSteamEngineOfPetrolIs5_65() {

		assertEquals("incorrect Batch cost for Steam Engine of COAL", 5.65f,
				coalSteamEngine.getBatchCost(), 0f);
		
	}
	
	@Test
	public void engineIsRunningWithAllowedFuelTypes() {
		assertTrue("Engine should have started with WOOD", woodSteamEngine.isRunning());
		assertTrue("Engine should have started with COAL", coalSteamEngine.isRunning());
	}
	
	@Test(expected=IllegalStateException.class)
	public void engineIsNotRunningWithNonAllowedFuelTypes() {
		woodSteamEngine = new SteamEngine(FuelType.DIESEL);
		woodSteamEngine.fill(FuelType.DIESEL, 100);
		woodSteamEngine.start();
	}
}
