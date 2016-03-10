/**********************************************************************
* This source code is the property of Lloyds Banking Group PLC.
*
* All Rights Reserved.
***********************************************************************/
package com.lloydsbanking.interview;

/**
 * This class emulates the behaviour of an Internal Combustion Engine.
 * 
 * @see Engine
 * 
 * @author Carlos Cambon
 * @version 1.0
 * @since 10/03/2016
 */
public class InternalCombustionEngine extends Engine {
	private static final float DIESEL_BATCH_COST = 12f;
	private static final float PETROL_BATCH_COST = 9f;
	private static short BATCH_SIZE = 8;
	private static FuelType[] allowedFuels = { FuelType.DIESEL, FuelType.PETROL };

	/**
	 * Constructs an internal combustion engine
	 */
	public InternalCombustionEngine(FuelType requiredFuelType) {
		super(requiredFuelType, allowedFuels, BATCH_SIZE);
	}

	/**
	 * {@inheritDoc}
	 */
	public float getBatchCost() {
		if (fuelType == FuelType.PETROL) {
			return PETROL_BATCH_COST;
		} else if (fuelType == FuelType.DIESEL) {
			return DIESEL_BATCH_COST;
		} else {
			throw new IllegalStateException("Engine is not filled with required fuel.");
		}
	}

}
