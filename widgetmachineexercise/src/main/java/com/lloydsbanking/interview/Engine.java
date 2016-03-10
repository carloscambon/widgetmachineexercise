package com.lloydsbanking.interview;

/**
 * This class emulates the behaviour of an Engine for the production of widgets.
 * Widgets are produced in batches, being the size and cost of the batch
 * different for the type of Engine and Fuel used.
 * 
 * @author Carlos Cambon
 * @version 1.0
 * @since 10/03/2016
 */
public abstract class Engine {
	private boolean running;
	private int fuelLevel;
	private FuelType requiredFuelType;
	protected FuelType fuelType;
	private FuelType[] allowedFuels;
	private short batchSize;

	/**
	 * Constructor of the Engine
	 * 
	 * @param requiredFuelType Fuel Type to be used
	 * @param allowedFuels Array of Fuel Types allowed on this engine 
	 * @param batchSize Size of the batch on this engine
	 */
	public Engine(FuelType requiredFuelType, FuelType[] allowedFuels, short batchSize) {
		this.requiredFuelType = requiredFuelType;
		this.allowedFuels = allowedFuels;
		this.batchSize = batchSize;
	}

	/**
	 * Method to start the engine when it has fuel of the right kind
	 */
	public void start() {
		if (fuelLevel > 0 && requiredFuelType.equals(fuelType)) {
			running = true;
		} else {
			throw new IllegalStateException("Not able to start engine.");
		}
	}

	/**
	 * Method to stop the engine
	 */
	public void stop() {
		running = false;
	}

	/**
	 * Returns if the engine is running or false otherwise
	 * @return boolean
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Method that fills the engine fuel deposit with a certain fuel type and to the desired level
	 * @param fuelType Fuel Type that the engine is being filled with
	 * @param fuelLevel Level of fuel to apply to the engine
	 */
	public void fill(FuelType fuelType, int fuelLevel) {
		if (fuelLevel >= 0 && fuelLevel <= 100) {
			this.fuelLevel = fuelLevel;
		} else if (fuelLevel > 100) {
			this.fuelLevel = 100;
		} else {
			this.fuelLevel = 0;
		}
		if (fuelType.isContainedIn(allowedFuels)) {
			this.fuelType = fuelType;
		} else {
			throw new IllegalStateException("Fuel " + fuelType + " is not allowed for this engine");
		}
	}

	/**
	 * @return the fuel type of this engine
	 */
	public FuelType getFuelType() {
		return requiredFuelType;
	}

	/**
	 * 
	 * @return batch size of this engine
	 */
	public short getBatchSize() {
		return batchSize;
	}

	/**
	 * @return float cost of the batch
	 */
	public abstract float getBatchCost();
}
