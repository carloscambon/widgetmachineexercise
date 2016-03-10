package com.lloydsbanking.interview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InternalCombustionEngineTest {
	
	InternalCombustionEngine internalCombustionEngineDiesel;
	InternalCombustionEngine internalCombustionEnginePetrol;
	
	@Before
	public void setup() {
		
		internalCombustionEngineDiesel = new InternalCombustionEngine(FuelType.DIESEL);
		internalCombustionEngineDiesel.fill(FuelType.DIESEL, 100);
		internalCombustionEngineDiesel.start();
		
		internalCombustionEnginePetrol = new InternalCombustionEngine(FuelType.PETROL);
		internalCombustionEnginePetrol.fill(FuelType.PETROL, 100);
		internalCombustionEnginePetrol.start();

	}

	@Test
	public void batchSizeOfanInternalCombustionEngineIs8() {
		
		assertEquals("incorrect Batch size for Internal Combustion Engine of DIESEL", 8,
				internalCombustionEngineDiesel.getBatchSize());

		assertEquals("incorrect Batch size for Internal Combustion Engine of PETROL", 8,
				internalCombustionEnginePetrol.getBatchSize());

	}

	@Test
	public void batchCostOfanInternalCombustionEngineOfDieselIs12() {
		
		assertEquals("incorrect Batch cost for Internal Combustion Engine of DIESEL", 12f,
				internalCombustionEngineDiesel.getBatchCost(), 0f);
		
	}

	@Test
	public void batchCostOfanInternalCombustionEngineOfPetrolIs9() {

		assertEquals("incorrect Batch cost for Internal Combustion Engine of PETROL", 9f,
				internalCombustionEnginePetrol.getBatchCost(), 0f);
		
	}
	
	@Test
	public void engineIsRunningWithAllowedFuelTypes() {
		assertTrue("Engine should have started with DIESEL", internalCombustionEngineDiesel.isRunning());
		assertTrue("Engine should have started with PETROL", internalCombustionEnginePetrol.isRunning());
	}
	
	@Test(expected=IllegalStateException.class)
	public void engineIsNotRunningWithNonAllowedFuelTypes() {
		internalCombustionEngineDiesel = new InternalCombustionEngine(FuelType.WOOD);
		internalCombustionEngineDiesel.fill(FuelType.WOOD, 100);
		internalCombustionEngineDiesel.start();
	}
}
