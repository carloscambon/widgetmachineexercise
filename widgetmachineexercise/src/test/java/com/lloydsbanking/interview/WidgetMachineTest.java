package com.lloydsbanking.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class WidgetMachineTest {

	@Test 
	public void costForQuantity8OnInternalCombustionEngineOnDieselIs12 () {

		Engine dieselEngine = new InternalCombustionEngine(FuelType.DIESEL);
		dieselEngine.fill(FuelType.DIESEL, 100);

		WidgetMachine widgetMachine = new WidgetMachine(dieselEngine );
		assertEquals("Price should be 12", 12f, widgetMachine.produceWidgets(8), 0f);
		
	}
	
	@Test 
	public void costForQuantity9OnInternalCombustionEngineOnDieselIs24 () {
		Engine dieselEngine = new InternalCombustionEngine(FuelType.DIESEL);
		dieselEngine.fill(FuelType.DIESEL, 100);
		
		WidgetMachine widgetMachine = new WidgetMachine(dieselEngine);
		assertEquals("Price should be 24", 24f, widgetMachine.produceWidgets(9), 0f);
		
	}
	
	@Test 
	public void costForQuantity8OnInternalCombustionEngineOnPetrolIs9 () {

		Engine PetrolEngine = new InternalCombustionEngine(FuelType.PETROL);
		PetrolEngine.fill(FuelType.PETROL, 100);

		WidgetMachine widgetMachine = new WidgetMachine(PetrolEngine );
		assertEquals("Price should be 9", 9f, widgetMachine.produceWidgets(8), 0f);
		
	}
	
	@Test 
	public void costForQuantity9OnInternalCombustionEngineOnPetrolIs18 () {
		Engine PetrolEngine = new InternalCombustionEngine(FuelType.PETROL);
		PetrolEngine.fill(FuelType.PETROL, 100);
		
		WidgetMachine widgetMachine = new WidgetMachine(PetrolEngine);
		assertEquals("Price should be 18", 18f, widgetMachine.produceWidgets(9), 0f);
		
	}
	
	@Test 
	public void costForQuantity2OnSteamEngineOnWoodIs4_35 () {

		Engine steamEngine = new SteamEngine(FuelType.WOOD);
		steamEngine.fill(FuelType.WOOD, 100);

		WidgetMachine widgetMachine = new WidgetMachine(steamEngine );
		assertEquals("Price should be 4.35", 4.35f, widgetMachine.produceWidgets(2), 0f);
		
	}
	
	@Test 
	public void costForQuantity3OnSteamEngineOnWoodIs8_70 () {

		Engine steamEngine = new SteamEngine(FuelType.WOOD);
		steamEngine.fill(FuelType.WOOD, 100);

		WidgetMachine widgetMachine = new WidgetMachine(steamEngine );
		assertEquals("Price should be 8.70", 8.70f, widgetMachine.produceWidgets(3), 0f);
		
	}
	
	@Test 
	public void costForQuantity2OnSteamEngineOnCoalIs5_65 () {

		Engine steamEngine = new SteamEngine(FuelType.COAL);
		steamEngine.fill(FuelType.COAL, 100);

		WidgetMachine widgetMachine = new WidgetMachine(steamEngine );
		assertEquals("Price should be 5.65", 5.65f, widgetMachine.produceWidgets(2), 0f);
		
	}
	
	@Test 
	public void costForQuantity3OnSteamEngineOnCoalIs11_30 () {

		Engine steamEngine = new SteamEngine(FuelType.COAL);
		steamEngine.fill(FuelType.COAL, 100);

		WidgetMachine widgetMachine = new WidgetMachine(steamEngine );
		assertEquals("Price should be 11.30", 11.30f, widgetMachine.produceWidgets(3), 0f);
		
	}
}
